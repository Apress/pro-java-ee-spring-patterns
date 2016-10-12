/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.insurance.view.delegate.impl;

import com.apress.einsure.report.async.messagecreator.ReportMessageCreatorImpl;
import com.apress.insurance.view.delegate.api.ReportingDelegate;
import java.util.Map;
import org.springframework.jms.core.JmsTemplate;

/**
 *
 * @author DKAYAL
 */
public class ReportingDelegateImpl implements ReportingDelegate{
    
    private JmsTemplate jmsTemplate;
    
    public long triggerReportGeneration(Map reportDataMap) {
        long reportId = 123;
        this.jmsTemplate.send(new ReportMessageCreatorImpl(reportDataMap));
        
        return reportId;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    
}
