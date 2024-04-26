package com.encapsulations.mypackage;

/*
 * Encapsulation allows you to restrict access to certain components of the object and only expose necessary functionalities, 
 * hiding the internal state and implementation details from the outside world.
 */
public class Book {

	private String name;
	private int id;
	private String author;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
