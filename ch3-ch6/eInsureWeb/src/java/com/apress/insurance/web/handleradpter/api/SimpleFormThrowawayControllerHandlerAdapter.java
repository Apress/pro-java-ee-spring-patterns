/**
 *
 */
package com.apress.insurance.web.handleradpter.api;

import com.apress.insurance.web.controller.api.SimpleFormThrowawayController;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.throwaway.ThrowawayControllerHandlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author DKAYAL
 *
 */
public class SimpleFormThrowawayControllerHandlerAdapter
    extends ThrowawayControllerHandlerAdapter {
	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.throwaway.ThrowawayControllerHandlerAdapter#supports(java.lang.Object)
	 */
	@Override
	public boolean supports(Object handler) {
		return (handler instanceof SimpleFormThrowawayController);
	}


	@Override
    public ModelAndView handle(HttpServletRequest req, HttpServletResponse res,
        Object command) throws Exception {
        SimpleFormThrowawayController throwaway = (SimpleFormThrowawayController) command;
        Object formBean = throwaway.getFormbeanClass().newInstance();

        ServletRequestDataBinder binder = createBinder(req, formBean);
        binder.bind(req);
        binder.closeNoCatch();

        return throwaway.execute(formBean);
    }
	
	
    protected ServletRequestDataBinder createBinder(
        HttpServletRequest request, Object formbean) throws Exception {
        ServletRequestDataBinder binder = new ServletRequestDataBinder(formbean,
                getCommandName());
        initBinder(request, binder);

        return binder;
    }
}
