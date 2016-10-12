/**
 * 
 */
package com.apress.insurance.web.controller.backup;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.throwaway.ThrowawayController;

/**
 * @author DKAYAL
 *
 */
public class SaveClaimController implements ThrowawayController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	private String claimantName;
	private String policyNo;
	private String productCd;


	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.throwaway.ThrowawayController#execute()
	 */
	public ModelAndView execute() throws Exception {
		//Invoke business logic here
		log.info("claimantName--"+claimantName);
		return new ModelAndView("claimDetails");
	}


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
