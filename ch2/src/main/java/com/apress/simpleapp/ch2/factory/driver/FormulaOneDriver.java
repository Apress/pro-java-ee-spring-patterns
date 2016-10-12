/**
 * 
 */
package com.apress.simpleapp.ch2.factory.driver;

import com.apress.simpleapp.ch2.f1.Car;
import com.apress.simpleapp.ch2.f1.CarFactory;

/**
 * @author DKAYAL
 * 
 */
public class FormulaOneDriver {
	public Car getCar() {
		Car car = CarFactory.getInstance("FERARI");
		return car;
	}
}
