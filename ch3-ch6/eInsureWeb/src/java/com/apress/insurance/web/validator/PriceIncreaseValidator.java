/**
 * 
 */
package com.apress.insurance.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.apress.insurance.web.formbean.PriceIncrease;

/**
 * @author dhrubo
 *
 */
public class PriceIncreaseValidator implements Validator {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	public boolean supports(Class clazz) {
        return PriceIncrease.class.equals(clazz);
    }

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	public void validate(Object formBean, Errors errors) {
		PriceIncrease pi = (PriceIncrease) formBean;
        if (pi == null) {
            errors.rejectValue("percentage", "error.not-specified", null, "Value required.");
        }

	}

}
