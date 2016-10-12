/**
 * 
 */
package com.apress.insurance.web.formbean;

import java.io.Serializable;

/**
 * @author DKAYAL
 *
 */
public class ClaimFormbean implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String claimantName;
	private String policyNo;
	private String productCd;

	
	/**
	 * @return the claimantName
	 */
	public String getClaimantName() {
		return claimantName;
	}


	/**
	 * @param claimantName the claimantName to set
	 */
	public void setClaimantName(String claimantName) {
		this.claimantName = claimantName;
	}


	/**
	 * @return the policyNo
	 */
	public String getPolicyNo() {
		return policyNo;
	}


	/**
	 * @param policyNo the policyNo to set
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}


	/**
	 * @return the productCd
	 */
	public String getProductCd() {
		return productCd;
	}


	/**
	 * @param productCd the productCd to set
	 */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	
}
