package com.encapsulations.mypackage;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		// book.id = 10;   book.id is not visible . Because is modifier is private. 
		
		// To access or modify private fields, we provide public getter and setter methods
		book.setId(5);
		book.getId();
		
		/*
		 * 
		 */
	}

}
