package com.nt.main;

import com.nt.comp.Flipkart;
import com.nt.factory.Flipkart_Factory;

public class Test_FactoryDp {

	public static void main(String[] args) {
	   Flipkart fp= Flipkart_Factory.getInstance("bluedart");
	
	   String shopingResString=fp.shopping(new String[] {"Dress","Bike"}, new double[] {5000.00,100000,00});
	   System.out.println(shopingResString);
	   
	}

}
