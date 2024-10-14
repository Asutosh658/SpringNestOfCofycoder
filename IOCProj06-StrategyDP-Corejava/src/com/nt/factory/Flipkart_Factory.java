package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Dtdc;
import com.nt.comp.Flipkart;
import com.nt.comp.ICourier;

public  class Flipkart_Factory{
	
	
	public static Flipkart getInstance(String courierType)

	{
		ICourier courier=null;
       
		if(courierType.equalsIgnoreCase("bluedart"))
		{
			courier = new BlueDart()	;
		}
		else if (courierType.equalsIgnoreCase("dtdc"))
		{
			courier =new Dtdc();
			
		}
		else {
			throw new IllegalArgumentException("put a valid information")	;
			}
		
		//create target class object 
		Flipkart fpkrt= new Flipkart();
		fpkrt.setCourier(courier);
		return fpkrt;
		
 	   
	}
	
}