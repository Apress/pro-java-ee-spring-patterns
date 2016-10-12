/**
 * 
 */
package com.apress.insurance.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author DKAYAL
 *
 */
public class SiteMeshSampleController implements Controller {
	private static final Log log = LogFactory.getLog(SiteMeshSampleController.class);
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		log.info("@@@ SiteMeshSampleController.handleRequest @@@");
		return new ModelAndView("sitemeshsample");
	}

}
