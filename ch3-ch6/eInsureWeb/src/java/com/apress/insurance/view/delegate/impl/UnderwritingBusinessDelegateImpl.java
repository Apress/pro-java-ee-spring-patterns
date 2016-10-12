/**
 * 
 */
package com.apress.insurance.view.delegate.impl;

import java.rmi.RemoteException;
import javax.ejb.CreateException;

import com.apress.einsure.business.ejbfacade.UnderwritingRemote;
import com.apress.einsure.business.ejbfacade.UnderwritingRemoteHome;

import com.apress.insurance.view.delegate.api.UnderwritingBusinessDelegate;


/**
 * @author DKAYAL
 * 
 */
public class UnderwritingBusinessDelegateImpl implements UnderwritingBusinessDelegate{

    private UnderwritingRemoteHome uwrRemoteHome;

    public UnderwritingRemoteHome getUwrRemoteHome() {
        return uwrRemoteHome;
    }

    public void setUwrRemoteHome(UnderwritingRemoteHome uwrRemoteHome) {
        this.uwrRemoteHome = uwrRemoteHome;
    }

    public void underwriteNewPolicy(String productCd, String name, int age) {
        System.out.println("uwrRemoteHome==>" + uwrRemoteHome);
        try {
            UnderwritingRemote bean = this.uwrRemoteHome.create();
            bean.underwriteNewPolicy(productCd, name, age);
        } catch (CreateException ex) {
            throw new RuntimeException(ex);
        } catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
    }
}
