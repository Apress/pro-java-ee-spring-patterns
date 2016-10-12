/**
 * 
 */
package com.apress.insurance.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;

import com.apress.insurance.web.controller.api.SimpleFormThrowawayController;
import com.apress.insurance.web.formbean.ClaimFormbean;

/**
 * @author DKAYAL
 *
 */
public class SaveClaimController implements SimpleFormThrowawayController {
	
	protected final Log log = LogFactory.getLog(getClass());
	

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.throwaway.ThrowawayController#execute()
	 */
	public ModelAndView execute(Object formBean) throws Exception {
		ClaimFormbean formbean = (ClaimFormbean)formBean;
		//Invoke business logic here
		log.info("formbean.getClaimantName()-->"+formbean.getClaimantName());
		return new ModelAndView("claimDetails");
	}


	public Class getFormbeanClass() {
		return ClaimFormbean.class;
	}
	
}
