/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.insurance.view.delegate.api;
import org.springframework.jms.core.JmsTemplate;
import java.util.Map;

/**
 *
 * @author DKAYAL
 */
public interface ReportingDelegate {
    public long triggerReportGeneration(Map reportDataMap);
    public void setJmsTemplate(JmsTemplate jmsTemplate);
}
