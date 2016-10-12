/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.api;


/**
 *
 * @author DKAYAL
 */
public interface UnderwritingApplicationService {
    public String BEAN_KEY = "uwrBusinessService";
    public void underwriteNewPolicy(String productCd,String name,int age);
}
