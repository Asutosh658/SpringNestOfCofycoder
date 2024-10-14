package com.nt.factory;

import com.nt.comp.CarInformation;
import com.nt.comp.ICarManufacture;
import com.nt.comp.Vehicle;

public class Carfactory {

	public static CarInformation getInStance(String carType) {
		
		  ICarManufacture carManufacture=null;
		  
		  if (carType.equalsIgnoreCase("Fortuner"))
		  {
			  carManufacture =new Vehicle("Fortuner" , "Disel");
			  
		  }
		  else  if (carType.equalsIgnoreCase("Tesla "))
		  {
			  carManufacture =new Vehicle("Tesla" , "Electric ");
			  
		  }
		  else if (carType.equalsIgnoreCase("Lambo"))
		  {
			  carManufacture =new Vehicle("Lambo" , "Hyper");
			  
		  }
		  else {
			  throw new IllegalArgumentException("Put  valid Information");
		  }
		   
		  CarInformation cimf= new CarInformation();
		  cimf.setcarDetails(carManufacture);
		  return cimf;
		  
	
}
}
