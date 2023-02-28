package com.project1;

public class Fan {
	String fanName;
	int wings;
	int price;
	//data variable are the (string fanName,int wings,int price.)
	//data types are only the (string,int,int etc.)

	public void fanwork() {
		System.out.println("Circulate the air..");

	}
    public void printFeatures(String fanName,int wings,int price) {
    	System.out.println("                    ");
    	System.out.println("Features of-"+fanName);
    	System.out.println("Name of fan-"+fanName);
    	System.out.println("number of wings-"+wings);
    	System.out.println("price of fan-"+price);
    }
}
