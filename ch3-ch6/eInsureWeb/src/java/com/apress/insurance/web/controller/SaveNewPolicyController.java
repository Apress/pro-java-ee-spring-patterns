/**
 * 
 */
package com.apress.insurance.web.controller;



import com.apress.einsure.business.api.UnderwritingBusinessService;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apress.insuranceapp.web.formbean.PolicyFormBean;

/**
 * @author DKAYAL
 * 
 */

public class SaveNewPolicyController extends SimpleFormController {
	protected final Log log = LogFactory.getLog(getClass());

	private UnderwritingBusinessService uwrBusinessService;

	public SaveNewPolicyController() {
		//setCommandClass(PolicyFormBean.class);
	}

	public void setUwrBusinessService(
			UnderwritingBusinessService uwrBusinessService) {
                log.info("setting ejb proxy");        
		this.uwrBusinessService = uwrBusinessService;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.SimpleFormController#doSubmitAction(java.lang.Object)
	 */
	@Override
	protected void doSubmitAction(Object formbean) throws Exception {
		PolicyFormBean policyBean = (PolicyFormBean)formbean;
		log.info("Accessing method on proxy"); 
		uwrBusinessService.underwriteNewPolicy(policyBean.getProductCode()
                        , policyBean.getFirstName(), policyBean.getAge());
        }
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.AbstractFormController#formBackingObject(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected Object formBackingObject(HttpServletRequest req) throws Exception {
		PolicyFormBean policyBean = (PolicyFormBean)super.formBackingObject(req); 
		
		return policyBean;
	}
	
	
	
/*
	
	@Override
	protected ModelAndView onSubmit(Object formbean) throws Exception {
		PolicyFormBean policyBean = (PolicyFormBean)formbean;
		uwrBusinessDelegate.createPolicy(policyBean);
		return new ModelAndView(this.getSuccessView(),"policydetails",formbean);
	}
*/
	
}
