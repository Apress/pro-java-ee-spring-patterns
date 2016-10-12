/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apress.einsure.security.audit;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author DKAYAL
 */
public class AuditAdviseInterceptor implements MethodInterceptor {

    private AuditRules rules;
    private boolean auditOn = true;
    private AuditLog auditLog;

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Method call intercepted by me!!!");
        Object returnVal = null;
        String eventCode = "";
        Object arguments[] = null;

        try {
            returnVal = invocation.proceed();
        } catch (Exception e) {
            //handle exception
            throw e;
        } finally {
            //post process
            if (this.auditOn) {
                eventCode = getEventCode();
                arguments = invocation.getArguments();
                AuditRule rule = rules.getRule(eventCode);
                if(rule!=null && rule.isApplyRule()){
                    String thisMethod = invocation.getMethod().getName();
                    if(thisMethod.equals(rule.getRuleDefinition())){
                        AuditEvent ae = new AuditEvent();
                        
                        auditLog.log(ae);
                    }
                }
            }
        }


        return returnVal;
    }

    private String getEventCode() {
        String eventCode = "";
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        eventCode = stack[7].getMethodName();
        return eventCode;
    }

    public AuditRules getRules() {
        return rules;
    }

    public void setRules(AuditRules rules) {
        this.rules = rules;
    }

    public boolean isAuditOn() {
        return auditOn;
    }

    public void setAuditOn(boolean auditOn) {
        this.auditOn = auditOn;
    }
}
