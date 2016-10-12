/**
 * 
 */
package com.apress.simpleapp.ch2.f1;

/**
 * @author DKAYAL
 *
 */
public class CarFactory {
		
	public static Car getInstance(String carTypeKey){
		Car retVal = null;
		if("FERRARI".equals(carTypeKey)){
			retVal = new FerrariCar();
		}		
		return retVal;
	}
}
