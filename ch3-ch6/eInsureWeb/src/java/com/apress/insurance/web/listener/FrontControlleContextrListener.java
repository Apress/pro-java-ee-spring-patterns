/**
 * 
 */
package com.apress.insurance.web.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.apress.insurance.common.dto.PolicyDetailTO;

/**
 * @author DKAYAL
 *
 */
public class FrontControlleContextrListener implements ServletContextListener {
	private final Log log =  LogFactory.getLog(getClass());

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent event) {
		

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent event) {
		log.info("Context initialized");
		List policyList = new ArrayList();
		PolicyDetailTO policyDetail = new PolicyDetailTO();
    	policyDetail.setFirstName("AKRAM");
    	policyList.add(policyDetail);
    	
    	policyDetail = new PolicyDetailTO();
    	policyDetail.setFirstName("CHAKRAM");
    	policyList.add(policyDetail);
    	
    	List productList = new ArrayList();
    	
    	productList.add("JEEVANANAND");
    	productList.add("JEEVANDHARA");
    	productList.add("JEEVANSHREE");
    	
    	
    	event.getServletContext().setAttribute("productCodeList", productList);
		event.getServletContext().setAttribute("policyDtlList", policyList);

	}

}
