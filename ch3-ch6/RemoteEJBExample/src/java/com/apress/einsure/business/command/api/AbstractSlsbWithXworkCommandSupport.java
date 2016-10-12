/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.einsure.business.command.api;

import com.opensymphony.xwork2.ActionProxyFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.CreateException;
import org.springframework.ejb.support.AbstractStatelessSessionBean;
import com.opensymphony.xwork2.config.Configuration;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.config.ConfigurationManager;
import java.util.Map;

/**
 *
 * @author DKAYAL
 */
public abstract class AbstractSlsbWithXworkCommandSupport
        extends AbstractStatelessSessionBean {

    private ActionProxyFactory actionProxyFactory;

    @Override
    protected void onEjbCreate() throws CreateException {
        ConfigurationManager manager = (ConfigurationManager) this.getBeanFactory().getBean("xConfigManager");
        System.out.println("manager==>"+manager);
        Configuration xWorkConfig = manager.getConfiguration();
        System.out.println("xWorkConfig==>"+xWorkConfig);
        actionProxyFactory = xWorkConfig.getContainer().getInstance(ActionProxyFactory.class);
    }

    public void execute(String nameSpace, String actionName, String methodName, Map context) {
        try {
            if (methodName == null) {
                methodName = "execute";
            }
            ActionProxy actionProxy = actionProxyFactory.createActionProxy(nameSpace, actionName, methodName, context);
            System.out.println("executing proxy");
            actionProxy.execute();
        } catch (Exception ex) {
            Logger.getLogger(AbstractSlsbWithXworkCommandSupport.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
