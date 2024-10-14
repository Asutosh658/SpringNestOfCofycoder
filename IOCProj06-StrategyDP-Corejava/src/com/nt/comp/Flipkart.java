package com.nt.comp;



import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
     //HAS-a property  
	private ICourier courier;
	
     public  void setCourier(ICourier courier)
     {
    	this.courier=courier; 
     }
     
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
