/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.api;

import java.rmi.RemoteException;

/**
 *
 * @author dhrubo
 */
public interface UnderwritingBusinessService {
    public void underwriteNewPolicy(String productCd,String name,int age) throws RemoteException;
}
