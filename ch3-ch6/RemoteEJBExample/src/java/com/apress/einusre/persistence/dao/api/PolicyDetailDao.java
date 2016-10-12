/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.einusre.persistence.dao.api;

import java.util.List;


/**
 *
 * @author DKAYAL
 */
public interface PolicyDetailDao {

    String SAVE_POLICY_DETAILS_SQL = " insert into T_POLICY_DETAIL values(T_POLICY_DETAIL_SEQ.nextval,?,?,?)";
    String LIST_POLICY_BY_PRODUCT_SQL = " select * from T_POLICY_DETAIL where PRODUCT_CD = ?";
    
    public void savePolicyDetails(String productCd,String name,int age);
    
    public List listPolicyByProductCode(String productCode);
}
