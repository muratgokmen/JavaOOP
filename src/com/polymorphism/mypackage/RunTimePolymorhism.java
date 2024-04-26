package com.polymorphism.mypackage;

public class RunTimePolymorhism {

	public static void main(String[] args) {
		// An example for runtime polymorhism
		letTheAnimalSpeak(new Animal());
		letTheAnimalSpeak(new Dog());
		letTheAnimalSpeak(new Ant());
	}
	
	static void letTheAnimalSpeak (Animal animal) {
		animal.speak();
	}

}
