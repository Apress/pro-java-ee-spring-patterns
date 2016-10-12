/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.security.audit;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author DKAYAL
 */
public class AuditEvent {
    private String eventCode;
    private String fullMethodName;
    private Object arguments[];
    private Object result;
    
    
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
}
