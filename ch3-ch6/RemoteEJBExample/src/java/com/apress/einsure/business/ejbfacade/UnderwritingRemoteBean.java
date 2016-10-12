/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.einsure.business.ejbfacade;

import com.apress.einsure.business.api.UnderwritingApplicationService;
import com.apress.einsure.business.api.UnderwritingBusinessService;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.CreateException;

import org.springframework.ejb.support.AbstractStatelessSessionBean;

/**
 *
 * @author DKAYAL
 */
public class UnderwritingRemoteBean extends AbstractStatelessSessionBean implements UnderwritingBusinessService{
    
    private final String SERVICE_BEAN_KEY = "uwrAppService";
        
    private UnderwritingApplicationService uwrAppService;

    public void underwriteNewPolicy(String productCd, String name, int age) throws RemoteException {
        //implement business rule
        //invoke Entity beans
        
        System.out.println("productCd-"+productCd);
        System.out.println("name-"+name);
        System.out.println("age-"+age);
        System.out.println("uwrAppService-"+uwrAppService);
        
        uwrAppService.underwriteNewPolicy(productCd, name, age);
        
        
        String SQL = "SELECT POLICY_ID,PRODUCT_CODE, NAME, AGE FROM T_POLICY_DETAILS WHERE PRODUCT_CODE = ?" +
                " AND AGE > ? ";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try{
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, productCd);
            pstmt.setInt(2, age);
            
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                //
            }
        }
        catch(SQLException sqlex){
            throw new RuntimeException(sqlex);
        }
        finally{
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        
    }

    protected void onEjbCreate() throws CreateException {
        //use for initialisation
        System.out.println("Hi now in EJB");
        System.out.println("Performing post initialisation");
        uwrAppService = (UnderwritingApplicationService) this.getBeanFactory().getBean(SERVICE_BEAN_KEY);
        System.out.println("uwrAppService-"+uwrAppService);
    }

   
}
