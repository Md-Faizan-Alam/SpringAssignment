package com.assignment.spring.Q2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("cat1")
	public Cat getCat() {
		Cat cat = new Cat("Tom","ragdoll",4);
		return cat;
	}
	@Bean("dog1")
	public Dog getDog() {
		Dog dog = new Dog("Pluto","bloodhound",5);
		return dog;
	}
	@Bean("person1")
	public Person getPerson() {
		Person person = new Person("Anthony","male",26);
		return person;
	}
	@Bean("pet")
	public Animal getAnimal() {
		Animal animal = new Animal("Porker",2);
		return animal;
	}
}
