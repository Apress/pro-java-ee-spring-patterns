/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpress.channel;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author DKAYAL
 */
public class PolicyQuoteClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ServiceException, AxisFault {
        accessViaSpringClient();
    }

    public static void accessViaSpringClient() {
        String configFile = "com/xpress/channel/spring-config.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configFile);
        PolicyQuoteBusinessDelegate delegate = (PolicyQuoteBusinessDelegate) ctx.getBean("policyQuoteDelegate");
        delegate.execute();
    }
    public static void callAxisWebservice() throws ServiceException, AxisFault{
        try {
            URL url = new URL("http://localhost:7001/eInsureWeb/axis/PolicyQuoteService");

            Service service = new Service();

            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(url);
            call.invoke("calculatePolicyQuote", new Object[]{"ff",1,2.5,4});
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(PolicyQuoteClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
