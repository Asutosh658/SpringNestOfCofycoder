package com.nt.main;

import com.nt.comp.CarInformation;
import com.nt.factory.Carfactory;

public class CarManufacture_Test {

	public static void main(String[] args) {
		CarInformation carInformation=Carfactory.getInStance("lambo");
	 String carRes	=carInformation.getCarDetails();
	 System.out.println(carRes);
	}

}
