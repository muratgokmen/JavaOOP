package com.interfaces.mypackage;

public interface Vehicle {
	
	String getFuelType();
	
	/*
	 *After From Java 8 ; if we want to use default method in java interface, 
	 *we need to use “default” keyword with the method signature
	*/
	default void log(String className) {
		System.out.println("Vehicle Interface loggin:  " + className);
	}
	
}
