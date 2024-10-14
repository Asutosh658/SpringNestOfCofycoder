package com.nt.main;

import com.nt.ston.Printer;

public class SingleTonClass_Test {

	public static void main(String[] args) {
		Printer pre1=Printer.getInstance();
		Printer pre2=Printer.getInstance();
		
		System.out.println("pre1==pre2"+(pre1==pre2) );
		System.out.println("pri_1 hashcode"+pre1.hashCode());
		System.out.println("pri_2 hashcode"+pre2.hashCode());
		

	}

}
