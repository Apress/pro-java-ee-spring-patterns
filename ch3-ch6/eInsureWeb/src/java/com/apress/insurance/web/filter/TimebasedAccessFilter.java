/**
 * 
 */
package com.apress.insurance.web.filter;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dhrubo
 *
 */
public class TimebasedAccessFilter implements Filter {
	
	private int startHour;
	private int endHour;

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		int currentHrofDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if((startHour <= currentHrofDay) && (currentHrofDay <= endHour)){
			chain.doFilter(request, response);
		}
		else{
			HttpServletResponse res = (HttpServletResponse)response;
			res.sendRedirect("html/downtimenotice.html");
		}

	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		startHour = Integer.parseInt(config.getInitParameter("starthour"));
		endHour = 	Integer.parseInt(config.getInitParameter("endhour"));
	}

}
