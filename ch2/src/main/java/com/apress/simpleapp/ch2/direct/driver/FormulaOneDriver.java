/**
 * 
 */
package com.apress.simpleapp.ch2.direct.driver;

import com.apress.simpleapp.ch2.f1.Car;
import com.apress.simpleapp.ch2.f1.FerrariCar;

/**
 * @author DKAYAL
 * 
 */
public class FormulaOneDriver {
	public Car getCar() {
		Car car = new FerrariCar();
		return car;
	}
}
