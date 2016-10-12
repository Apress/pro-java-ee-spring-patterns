/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.impl;

import com.apress.einsure.business.api.PolicyQuoteBusinessService;


/**
 *
 * @author DKAYAL
 */

public class PolicyQuoteBusinessServiceImpl implements PolicyQuoteBusinessService{

    public double calculatePolicyQuote(String productCd, int age, double sumAssured, int term) {
        System.out.println("PolicyQuoteBusinessServiceImpl");
        System.out.println("productCd=="+productCd);
        System.out.println("age=="+age);
        System.out.println("sumAssured=="+sumAssured);
        System.out.println("term=="+term);
        return 44.3;
    }

}
