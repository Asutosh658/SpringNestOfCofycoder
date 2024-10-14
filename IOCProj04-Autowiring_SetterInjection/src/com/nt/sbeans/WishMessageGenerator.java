package com.nt.sbeans;

import java.time.LocalTime;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
   
	//@Autowired
	private LocalTime lt;
	
	//Getter injection
	@Autowired
	public void setLt(LocalTime lt) {
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt;
	}




public String  generateLtime(String user) {
	 
	  int hour=lt.getHour();
	  if (hour<12)
	  {
		  return user+" Good Morning";
	  }
	  else if(hour<16)
	  {
		  return user+" Good Afternoon";
		  
	  }
	  else if(hour<20)
	  {
		  return user+" Good Evening";
	  }
	  else
	  {
		  return user+" Good Night";
	  }
	
}
}
