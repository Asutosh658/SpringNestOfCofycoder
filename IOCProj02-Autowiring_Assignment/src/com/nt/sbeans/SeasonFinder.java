package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("abc")
public class SeasonFinder {
	@Autowired
	private LocalDate ld;
	
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
