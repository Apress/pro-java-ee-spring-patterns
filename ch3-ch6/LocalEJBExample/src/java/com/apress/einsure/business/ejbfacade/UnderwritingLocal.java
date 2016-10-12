/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.ejbfacade;

import javax.ejb.EJBLocalObject;

/**
 *
 * @author DKAYAL
 */
public interface UnderwritingLocal extends EJBLocalObject {
    public void underwriteNewPolicy(String productCd,String name,int age);
}
