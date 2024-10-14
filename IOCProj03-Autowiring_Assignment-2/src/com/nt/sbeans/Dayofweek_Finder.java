package com.nt.sbeans;

import java.time.DayOfWeek;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dwf")
public class Dayofweek_Finder {
     @Autowired
	 private LocalDateTime aldt;
	 
	public String dayFinder() {
		     DayOfWeek dow= aldt.getDayOfWeek();
		      int weekd= dow.getValue();
		      
		      if (weekd>=1 && weekd<=5)
		      {
		    	  return " you got Weekdays to Work";
		      }
		      else
		      {
		    	  return "Happy Weekends Njoy YOur Weeknds";
		      }
		
	}
	 
}
