package com.inheritance.mypackage;

public class Dog extends Animal {
	
	String dogSpeakVoiceNaming = "Bark";
	
	// Just dogs bark 
	@Override
	void speak() {
		System.out.println("Dogs is speak voice like : " + dogSpeakVoiceNaming);;
	}

}
