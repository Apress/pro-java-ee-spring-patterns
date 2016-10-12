package com.apress.insuranceapp.beans;

import java.io.Serializable;

public class PolicyDetail implements Serializable {
	private String policyId;

	/**
	 * @return the policyId
	 */
	public String getPolicyId() {
		return policyId;
	}

	/**
	 * @param policyId the policyId to set
	 */
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	
	
}
