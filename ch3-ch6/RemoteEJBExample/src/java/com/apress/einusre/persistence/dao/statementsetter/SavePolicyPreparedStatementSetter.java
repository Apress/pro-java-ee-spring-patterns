/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einusre.persistence.dao.statementsetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.jdbc.core.PreparedStatementSetter;

/**
 *
 * @author DKAYAL
 */
public final class SavePolicyPreparedStatementSetter implements PreparedStatementSetter{
    private String productCd;
    private String name;
    private int age;
    
    public SavePolicyPreparedStatementSetter(String productCd,String name,int age){
        this.productCd = productCd;
        this.name = name;
        this.age = age;
    }
    public void setValues(PreparedStatement pstmt) throws SQLException {
        pstmt.setString(0, productCd);
        pstmt.setString(1, productCd);
        pstmt.setInt(2, age);
    }

}
