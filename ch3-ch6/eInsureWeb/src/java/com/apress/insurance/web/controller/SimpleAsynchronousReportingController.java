/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.insurance.web.controller;

import com.apress.insurance.view.delegate.api.ReportingDelegate;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author DKAYAL
 */
public class SimpleAsynchronousReportingController 
    implements Controller{
    
    private ReportingDelegate reportDelegate;
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map reportDataMap = new HashMap(request.getParameterMap());
        
        long reportId = reportDelegate.triggerReportGeneration(reportDataMap);
        
        return new ModelAndView("reportstatus","reportId",reportId);
    }

    public ReportingDelegate getReportDelegate() {
        return reportDelegate;
    }

    public void setReportDelegate(ReportingDelegate reportDelegate) {
        this.reportDelegate = reportDelegate;
    }
    
    

}
