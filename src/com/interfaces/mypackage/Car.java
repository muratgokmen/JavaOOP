package com.interfaces.mypackage;

public interface Car {
	
	/*
	 *After From Java 8 ; if we want to use default method in java interface, 
	 *we need to use “default” keyword with the method signature
	*/
	default void log(String className) {
		System.out.println("Car Interface loggin: " + className);
	}
	
	default void print(String str) {
		if(!isNull(str))
			System.out.println("Car Print......");
	}
	
	static boolean isNull(String str) {
		System.out.println("Car Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}

}
