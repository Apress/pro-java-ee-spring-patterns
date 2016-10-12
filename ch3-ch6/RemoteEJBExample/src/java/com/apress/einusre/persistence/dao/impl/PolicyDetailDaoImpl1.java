/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einusre.persistence.dao.impl;

import com.apress.einusre.persistence.dao.api.PolicyDetailDao;
import com.apress.einusre.persistence.dao.statementsetter.SavePolicyPreparedStatementSetter;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


/**
 *
 * @author DKAYAL
 */
public class PolicyDetailDaoImpl1 extends JdbcDaoSupport implements PolicyDetailDao{
    
    public void savePolicyDetails(String productCd,String name,int age) {
        this.getJdbcTemplate().update(PolicyDetailDao.SAVE_POLICY_DETAILS_SQL, 
                new SavePolicyPreparedStatementSetter(productCd,name,age));
        
    }

    public List listPolicyByProductCode(String productCode) {
        return this.getJdbcTemplate().queryForList(PolicyDetailDao.LIST_POLICY_BY_PRODUCT_SQL,
                new Object[]{productCode});
    }
    
}
