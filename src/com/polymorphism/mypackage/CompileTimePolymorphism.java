package com.polymorphism.mypackage;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Math math = new Math();
		
		//For example , compile time polymorhism
		int addIntValues = math.add(5, 5);
		double addDoubleValues = math.add(1.5, 25.5);

	}

}
