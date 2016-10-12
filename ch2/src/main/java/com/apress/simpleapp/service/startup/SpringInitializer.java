/**
 * 
 */
package com.apress.simpleapp.service.startup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


/**
 * @author DKAYAL
 *
 */
public class SpringInitializer {
	public static BeanFactory factory;
	public void startupSpringContext(){
		Resource res = new FileSystemResource("C:/OMSWorkspace/ch2/src/main/resources/com/apress/simpleapp/service/startup/spring-config.xml");
		factory = new XmlBeanFactory(res);
	}
	private static BeanFactory getBeanFactory(){
		return factory;
	}
	public static Object getBean(String key){
		return getBeanFactory().getBean(key);
	}
}
