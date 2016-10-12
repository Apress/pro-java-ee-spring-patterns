/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.ejbfacade;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

/**
 *
 * @author DKAYAL
 */
public interface UnderwritingLocalHome extends EJBLocalHome {
    
    com.apress.einsure.business.ejbfacade.UnderwritingLocal create()  throws CreateException;

}
