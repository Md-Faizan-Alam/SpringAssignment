package com.assignment.spring.Q2;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private String gender;
	private int age;
	@Autowired
	private Animal pet;
	
	public Person() {}
	public Person(String name,String gender,int age) {this.setName(name);this.gender=gender;this.setAge(age);}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public Animal getPet() {return pet;}
	public void setPet(Animal pet) {this.pet = pet;}
	
	public String getDetails() {
		return name+" is a "+age+" years old "+gender+" human being and has a pet named "+pet.getName()+"\n"+pet.getDetails();
	}
	
}
