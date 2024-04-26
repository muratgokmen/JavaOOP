package com.interfaces.mypackage;

public class Main {

	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.log(audi.getClass().getName());
		audi.print("");
		audi.isNull("Test");
	}

}
