package com.interfaces.mypackage;

public class Audi implements Vehicle, Car {
	
	String fuelType = "Diesel";

	/*
	 There are two implementation both Vehicle and Car for Audi class. 
     Audi class is implementing both the above interfaces, 
     it will have to provide implementation for log() method otherwise compiler will throw compile time error
	 */
	@Override
	public void log(String className) {	
		Vehicle.super.log(className);
	}

	@Override
	public String getFuelType() {
		return this.fuelType;
	}
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");
		return str == null ? true : false;
	}
	
}
