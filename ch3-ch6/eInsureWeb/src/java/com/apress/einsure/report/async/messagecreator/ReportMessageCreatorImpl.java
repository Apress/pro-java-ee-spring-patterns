/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.report.async.messagecreator;

import java.util.Map;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.jms.core.MessageCreator;

/**
 *
 * @author DKAYAL
 */
public class ReportMessageCreatorImpl implements MessageCreator{
    
    private Map reportData;
    
    public ReportMessageCreatorImpl(Map reportData){
        this.reportData = reportData;
    }
    
    public Message createMessage(Session jmsSession) throws JMSException {
        MapMessage message = jmsSession.createMapMessage();
        message.setObject("REPORT_DATA", "XYZ");
        
        return message;
    }

}
