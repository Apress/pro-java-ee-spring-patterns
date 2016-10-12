/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.security.audit;

import java.util.Map;

/**
 *
 * @author DKAYAL
 */
public class AuditRules{
    public Map ruleMap;
    public AuditRule getRule(String key){
        return (AuditRule)ruleMap.get(key);
    }

    public Map getRuleMap() {
        return ruleMap;
    }

    public void setRuleMap(Map ruleMap) {
        this.ruleMap = ruleMap;
    }
    
    
}
