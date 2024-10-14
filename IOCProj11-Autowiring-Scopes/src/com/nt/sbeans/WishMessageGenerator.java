package com.nt.sbeans;

import java.time.LocalDate;

import java.time.LocalTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("prototype")
public class WishMessageGenerator {
   
	@SuppressWarnings("unused")
	@Autowired
	private LocalTime lt;
	
	@SuppressWarnings("unused")
	@Autowired
	private LocalDate dt;
	
  /*public String  generateLtime(String user) {
	 
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
	
}*/
}
