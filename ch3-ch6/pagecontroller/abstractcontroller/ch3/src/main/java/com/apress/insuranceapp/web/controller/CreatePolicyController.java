package com.apress.insuranceapp.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.apress.insuranceapp.beans.PolicyDetail;
import com.apress.insuranceapp.business.delegate.UnderwritingBusinessDelegate;

public class CreatePolicyController implements Controller{

	private UnderwritingBusinessDelegate uwrBusinessDelegate;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// transform data from request to a form suitable for use in business
		// layer
		PolicyDetail policyDetail = new PolicyDetail();
		policyDetail.setPolicyId(request.getParameter("policyId"));
		
		// invoke business component
		this.uwrBusinessDelegate.createPolicy(policyDetail);
		Map model = new HashMap();
		model.put("POLICY_DETAIL", policyDetail);
		// return model and next view
		return new ModelAndView("Success", model);
	}

	public void setUwrBusinessDelegate(
			UnderwritingBusinessDelegate uwrBusinessDelegate) {
		this.uwrBusinessDelegate = uwrBusinessDelegate;
	}
}
