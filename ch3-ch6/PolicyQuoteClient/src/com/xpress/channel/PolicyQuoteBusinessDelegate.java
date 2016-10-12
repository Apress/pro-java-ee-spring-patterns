/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xpress.channel;

import com.apress.einsure.business.api.PolicyQuoteBusinessService;

/**
 *
 * @author DKAYAL
 */
public class PolicyQuoteBusinessDelegate {
    private PolicyQuoteBusinessService service;
    
    public void execute(){
        this.service.calculatePolicyQuote("HEY", 12, 1000, 10);
    }
    
    public PolicyQuoteBusinessService getService() {
        return service;
    }

    public void setService(PolicyQuoteBusinessService service) {
        this.service = service;
    }
    
    
}
