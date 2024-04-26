package com.inheritance.mypackage;

public class Bird extends Animal {
	
	String movementType = "Birds fly";
	
	//This method overrided because this feature is different other animals.
	@Override
	String getMovementType() {
		return movementType;
	}
	
}
