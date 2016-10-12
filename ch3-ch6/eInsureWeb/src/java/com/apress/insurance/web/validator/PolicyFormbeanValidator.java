/**
 * 
 */
package com.apress.insurance.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.apress.insuranceapp.web.formbean.PolicyFormBean;


/**
 * @author dhrubo
 *
 */
public class PolicyFormbeanValidator implements Validator {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	public boolean supports(Class clazz) {
        return PolicyFormBean.class.equals(clazz);
    }

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	public void validate(Object formBean, Errors errors) {
		PolicyFormBean policybean = (PolicyFormBean) formBean;
		
		ValidationUtils.rejectIfEmpty(errors, "firstName", "mandatoryfirstname");
		
	}	
}
