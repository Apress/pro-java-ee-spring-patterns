/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einusre.persistence.dao.impl;

import com.apress.einusre.persistence.dao.api.PolicyDetailDao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



/**
 *
 * @author DKAYAL
 */
public class PolicyDetailDaoImpl extends HibernateDaoSupport implements PolicyDetailDao{
    
    public List listPolicyByProductCode(String productCode) {
        return getHibernateTemplate().find( "from ProductDetail where productCode = ?", productCode);
    }

    public void savePolicyDetails(String productCd, String name, int age) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
