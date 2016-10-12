package com.apress.simpleapp.service.locator;


import com.apress.simpleapp.service.CarService;
import com.apress.simpleapp.service.startup.SpringInitializer;


public class CarServiceLocator {
	
	public CarService getCarService(){
	
		CarService service = (CarService) SpringInitializer.getBean("carService");
		return service;
	}
	
}
