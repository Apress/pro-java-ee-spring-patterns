/**
 * 
 */
package com.apress.insurance.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.apress.insurance.web.formbean.PriceIncrease;

/**
 * @author dhrubo
 * 
 */
public class PriceIncreaseFormController extends SimpleFormController {
	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView onSubmit(Object command) throws Exception {

		int increase = ((PriceIncrease) command).getPercentage();
		logger.info("Increasing prices by " + increase + "%.");

		
		logger.info("returning from PriceIncreaseForm view to "
				+ getSuccessView());

		return new ModelAndView(new RedirectView(getSuccessView()));
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		PriceIncrease priceIncrease = new PriceIncrease();
		
		return priceIncrease;
	}
}
