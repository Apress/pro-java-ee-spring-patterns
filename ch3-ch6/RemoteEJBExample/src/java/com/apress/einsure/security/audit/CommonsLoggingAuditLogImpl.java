/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.security.audit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/**
 *
 * @author DKAYAL
 */
public class CommonsLoggingAuditLogImpl implements AuditLog{
    private final Log _LOG = LogFactory.getLog(getClass());
    public void log(AuditEvent event) {
        _LOG.info(event);
    }

}
