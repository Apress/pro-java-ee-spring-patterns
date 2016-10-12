/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.security.audit;

/**
 *
 * @author DKAYAL
 */
public interface AuditLog {
    public void log(AuditEvent event);
}
