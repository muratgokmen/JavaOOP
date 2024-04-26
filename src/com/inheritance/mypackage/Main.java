package com.inheritance.mypackage;

public class Main {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		String birdsMovementType = bird.getMovementType();
		System.out.println("Birds movement type is : " + birdsMovementType);
		
		Dog dog = new Dog();
		dog.speak();
		
		Animal animal = new Bird();
		System.out.println(animal.getMovementType()); // Bird class => getMovementType() 

	}

}
