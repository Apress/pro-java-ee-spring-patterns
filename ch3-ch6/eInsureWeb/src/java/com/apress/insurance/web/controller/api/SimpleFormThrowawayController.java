/**
 * 
 */
package com.apress.insurance.web.controller.api;

import org.springframework.web.servlet.ModelAndView;

/**
 * @author DKAYAL
 *
 */
public interface SimpleFormThrowawayController {
	public ModelAndView execute(Object formBean) throws Exception;
	public Class getFormbeanClass();
	
}
