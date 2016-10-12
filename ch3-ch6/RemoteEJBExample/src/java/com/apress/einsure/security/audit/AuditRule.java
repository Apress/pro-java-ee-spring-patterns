/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.security.audit;

/**
 *
 * @author DKAYAL
 */
public class AuditRule {
    private String ruleDefinition;
    private boolean applyRule = true;

    public boolean isApplyRule() {
        return applyRule;
    }

    public void setApplyRule(boolean applyRule) {
        this.applyRule = applyRule;
    }

    public String getRuleDefinition() {
        return ruleDefinition;
    }

    public void setRuleDefinition(String ruleDefinition) {
        this.ruleDefinition = ruleDefinition;
    }
    
    
}
