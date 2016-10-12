/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.business.impl;

import com.apress.einsure.business.api.UnderwritingApplicationService;

import com.apress.einusre.persistence.dao.api.PolicyDetailDao;


/**
 *
 * @author DKAYAL
 */
public class UnderwritingApplicationServiceImpl implements UnderwritingApplicationService{
    
    private PolicyDetailDao policyDetailDao;
    
    public void underwriteNewPolicy(String productCd, String name, int age)  {
        System.out.println("POJO");
        System.out.println("productCd==>" + productCd);
        System.out.println("name==>" + name);
        System.out.println("age==>" + age);
        
        //business validation - is this age fine to create 
        //policy for this product
        
        //this.policyDetailDao.savePolicyDetails(productCd, name, age);
        

        
    }

    public PolicyDetailDao getPolicyDetailDao() {
        return policyDetailDao;
    }

    public void setPolicyDetailDao(PolicyDetailDao policyDetailDao) {
        this.policyDetailDao = policyDetailDao;
    }
    
    
}
