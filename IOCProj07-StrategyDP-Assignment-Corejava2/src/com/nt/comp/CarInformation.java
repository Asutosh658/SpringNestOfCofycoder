package com.nt.comp;

public class CarInformation {
   
	//HAS-A property
	private ICarManufacture carman;
	
	public void setcarDetails(ICarManufacture carman)
	{
		this.carman=carman;
	}
	
	public String getCarDetails() {
		 String carName= carman.getCarName();
		 String CarEngine=carman.getEngineType();
		 
		 return "carname is ::"+carName+ " car engine type ::"+CarEngine;
	}
	

}
