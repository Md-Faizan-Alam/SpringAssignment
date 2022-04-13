package com.assignment.spring.Q2;

public class Dog extends Animal{
	private String breed;
	
	public Dog() {}
	public Dog(String name,String breed,int age) {
		super(name,age);
		this.breed = breed;
	}
	
	public void setBreed(String breed) {this.breed=breed;}
	public String getBreed() {return this.breed;}
	
	@Override
	public String getDetails() {
		return this.getName()+" is a "+this.getAge()+" years old dog, of the breed "+breed;
	}
	
	
	
}
