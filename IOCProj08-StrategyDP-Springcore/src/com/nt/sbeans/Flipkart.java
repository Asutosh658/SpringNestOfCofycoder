package com.nt.sbeans;
import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
     //HAS-a property  
	
	
	
	@Autowired
	private ICourier courier;
	//nothing but it is useful when you want to change dependency  dynamically
	//This is useful in cases where you want to switch the courier service at runtime, based on different conditions or configurations.
    /* public  void setCourier(ICourier courier)
     {
    	this.courier=courier; 
     }
     */
	

	
     public String  shopping (String items[],double price[])
     {
    	  double billamount=0.0;
    	  
    	  //using enhanced for loop
    	  for(double p:price)
    	  {
    		  billamount = billamount+p;
    	  }
    	  
    	  int oid=new Random().nextInt(123456789);
    	  String res=courier.delivery(oid);
    	  
    	 return Arrays.toString(items)+"item with billamount::"+billamount+"--"+res;
    	
     }
	 
}
  