package com.nt.ston;

public class Printer {
      
private static Printer instance;
//private constructor 
private Printer() {
	System.out.println("Printer.Printer()");
}

//factory method for accessing object of printer class
public static Printer getInstance() {
	if(instance==null)
	{
		instance = new Printer();
	}
	return instance;
}
	
}
