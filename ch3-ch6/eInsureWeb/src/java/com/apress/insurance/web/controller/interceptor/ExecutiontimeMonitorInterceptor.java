/**
 * 
 */
package com.apress.insurance.web.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author DKAYAL
 *
 */
public class ExecutiontimeMonitorInterceptor extends HandlerInterceptorAdapter {
	private final Log log = LogFactory.getLog(ExecutiontimeMonitorInterceptor.class);
	
	private static final String START_EXECUTION_TIME_KEY = "executionStartTime";
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		long executionStartTime = (Long) request.getAttribute(START_EXECUTION_TIME_KEY);
		long executionEndTime = System.currentTimeMillis();
		
		StringBuffer logTxt = new StringBuffer("Execution completed for request - ");
		logTxt.append(request.getRequestURI());
		logTxt.append(", handler -");
		logTxt.append(handler);
		logTxt.append(", total execution time(ms) -");
		logTxt.append((executionEndTime - executionStartTime));
		
		log.info(logTxt.toString());
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		request.setAttribute(START_EXECUTION_TIME_KEY, System.currentTimeMillis());
		return true;
	}
	
}
