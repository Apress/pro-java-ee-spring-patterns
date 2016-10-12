/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einsure.report.async.messagelistener;

import java.util.Map;



/**
 *
 * @author DKAYAL
 */
public class ReportMessageListener {
    private void processReport(Map reportParams){
        System.out.println("POJO message listener-"+reportParams);
    }
}
