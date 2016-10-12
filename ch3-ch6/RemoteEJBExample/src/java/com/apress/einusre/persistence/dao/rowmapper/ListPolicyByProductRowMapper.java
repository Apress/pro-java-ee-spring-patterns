/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einusre.persistence.dao.rowmapper;

import com.apress.einsure.common.to.PolicyDetailTo;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author DKAYAL
 */
public class ListPolicyByProductRowMapper implements RowMapper{

    public Object mapRow(ResultSet rs, int rowCount) throws SQLException {
        
        long policyId = rs.getLong(1);
        String productCode = rs.getString(2);
        String name = rs.getString(3);
        int age = rs.getInt(4);
        PolicyDetailTo policyDetail = new PolicyDetailTo(policyId,
                   productCode,name,age);
        
        return policyDetail;
    }
    
}
