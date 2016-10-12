/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.api;


/**
 *
 * @author DKAYAL
 */
public interface PolicyQuoteBusinessService {
    public String BEAN_KEY = "policyQuoiteBusinessService";
    
    public double calculatePolicyQuote(String productCd,int age, double sumAssured,int term);
}
