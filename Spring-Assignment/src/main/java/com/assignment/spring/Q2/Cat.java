package com.assignment.spring.Q2;

public class Cat extends Animal{
	private String breed;
	
	public Cat() {}
	public Cat(String name,String breed,int age) {
		super(name,age);
		this.breed = breed;
	}
	
	public void setBreed(String breed) {this.breed=breed;}
	public String getBreed() {return this.breed;}
	
	@Override
	public String getDetails() {
		return this.getName()+" is a "+this.getAge()+" years old cat, of the breed "+breed;
	}
	
	
	
}
