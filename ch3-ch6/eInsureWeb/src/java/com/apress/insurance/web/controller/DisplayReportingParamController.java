/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.insurance.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author DKAYAL
 */
public class DisplayReportingParamController 
    implements Controller{
    
    
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
              
        return new ModelAndView("reportparam");
    }

    
    

}
