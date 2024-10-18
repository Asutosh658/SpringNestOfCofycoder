package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
   
	@Autowired
	private LocalTime lt;
	
	@Autowired
	private LocalDate ld;
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
  
  public String  generateSeason() {
		int currentMonthValue = ld.getMonthValue();
		
		if (currentMonthValue >=3 &&currentMonthValue<=6)
		{
			return "Summer Season " ;
		}
		else if (currentMonthValue >=7 &&currentMonthValue<=10)
		{
			return "Rainy Season " ;
		}
		else {
			return "Winter Season";
		}
}
}
