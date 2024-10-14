package com.nt.comp;

public class Vehicle implements ICarManufacture {

	private String carName;
    private String engineType;
	
	 
    public Vehicle(String carName,String engineType)
    {
    	this.carName=carName;
    	this.engineType=engineType;
    }
    
    
	@Override
	public String getCarName() {
		
		return carName;
	}

	@Override
	public String getEngineType() {
		
		return engineType;
	}

	

	
	
  


}
