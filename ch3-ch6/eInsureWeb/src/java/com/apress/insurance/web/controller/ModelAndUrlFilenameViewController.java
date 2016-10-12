/**
 * 
 */
package com.apress.insurance.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.mvc.UrlFilenameViewController;

/**
 * @author DKAYAL
 *
 */
public class ModelAndUrlFilenameViewController extends UrlFilenameViewController{
	@Override
	protected String getViewNameForRequest(HttpServletRequest req) {
		String viewName = super.getViewNameForRequest(req);
		return viewName;
	}
}
