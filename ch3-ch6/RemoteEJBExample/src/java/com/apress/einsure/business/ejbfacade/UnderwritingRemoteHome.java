/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.ejbfacade;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 *
 * @author DKAYAL
 */
public interface UnderwritingRemoteHome extends EJBHome {

    UnderwritingRemote create()  throws CreateException, RemoteException;
    
}
