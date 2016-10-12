/**
 * 
 */
package com.apress.simpleapp.service;

import com.apress.simpleapp.ch2.f1.Car;
import com.apress.simpleapp.dao.CarDao;

/**
 * @author DKAYAL
 * 
 */
public class CarServiceImpl implements CarService {
	private CarDao carDao;
	/* constructor injection
	 * 
	 */
	
	/*
	public CarServiceImpl(CarDao carDao) {
		this.carDao = carDao;
	}
	*/
	public void refuel(Car car) {
		carDao.updateFuelConsumed(car);
	}

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}
}
