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

import com.apress.insurance.common.dto.PolicyDetailTO;
import com.apress.insurance.view.delegate.impl.UnderwritingBusinessDelegateImpl;

/**
 * @author dhrubo
 *
 */
public class PolicyDetailsController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	
	private UnderwritingBusinessDelegateImpl businessDelegate;
	
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	int policyId = 5555;
    	PolicyDetailTO policyDetail = null;
    	//PolicyDetailTO policyDetail = getBusinessDelegate().getPolicyDetails(policyId);
    	
    	return new ModelAndView("policydetails","policydetails",policyDetail);
    }

	/**
	 * @return the businessDelegate
	 */
	public UnderwritingBusinessDelegateImpl getBusinessDelegate() {
		return businessDelegate;
	}

	/**
	 * @param businessDelegate the businessDelegate to set
	 */
	public void setBusinessDelegate(UnderwritingBusinessDelegateImpl businessDelegate) {
		this.businessDelegate = businessDelegate;
	}
    
    
}
