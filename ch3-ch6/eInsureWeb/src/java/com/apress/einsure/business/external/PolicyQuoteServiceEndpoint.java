/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.external;

import com.apress.einsure.business.api.PolicyQuoteBusinessService;
import org.springframework.remoting.jaxrpc.ServletEndpointSupport;

/**
 *
 * @author DKAYAL
 */
public class PolicyQuoteServiceEndpoint extends ServletEndpointSupport
    implements PolicyQuoteBusinessService{
    
    private PolicyQuoteBusinessService policyQuoteService;
    
    protected void onInit() {
        System.out.println("init called on endpoint");
        this.policyQuoteService = (PolicyQuoteBusinessService) getWebApplicationContext().getBean(PolicyQuoteBusinessService.BEAN_KEY);
    }
    
    public double calculatePolicyQuote(String productCd, int age, double sumAssured, int term) {
        return policyQuoteService.calculatePolicyQuote(productCd, age, sumAssured, term);
    }

}
