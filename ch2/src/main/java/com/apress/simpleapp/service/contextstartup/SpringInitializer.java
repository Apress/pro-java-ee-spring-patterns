/**
 * 
 */
package com.apress.simpleapp.service.contextstartup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author DKAYAL
 *
 */
public class SpringInitializer {
	public static ApplicationContext context;
	public void startupSpringContext(){
		context = new 
		ClassPathXmlApplicationContext("spring-config.xml");
	}
	private static ApplicationContext getBeanFactory(){
		return context;
	}
	public static Object getBean(String key){
		return getBeanFactory().getBean(key);
	}
}
