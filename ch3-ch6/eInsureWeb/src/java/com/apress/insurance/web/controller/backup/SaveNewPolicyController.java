/**
 * 
 */
package com.apress.insurance.web.controller.backup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.AbstractCommandController;
import com.apress.insurance.view.delegate.impl.UnderwritingBusinessDelegateImpl;
import com.apress.insuranceapp.web.formbean.PolicyFormBean;

/**
 * @author DKAYAL
 * 
 */

public class SaveNewPolicyController extends AbstractCommandController {
	protected final Log log = LogFactory.getLog(getClass());

	private UnderwritingBusinessDelegateImpl uwrBusinessDelegate;

	public SaveNewPolicyController() {
		this.setCommandClass(PolicyFormBean.class);
	}

	public void setUwrBusinessDelegate(
			UnderwritingBusinessDelegateImpl uwrBusinessDelegate) {
		this.uwrBusinessDelegate = uwrBusinessDelegate;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse res, Object formBean, BindException errors)
			throws Exception {
		PolicyFormBean policyBean = (PolicyFormBean) formBean;
		log.info("First Name--" + policyBean.getFirstName());
		log.info("Last Name--" + policyBean.getLastName());
		log.info("Age --" + policyBean.getAge());

		//this.uwrBusinessDelegate.createPolicy(policyBean);
		

		return new ModelAndView("showPolicydetails","policydetails",policyBean);
	}
}
