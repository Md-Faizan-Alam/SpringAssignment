package com.assignment.spring.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Cat cat1 = (Cat)context.getBean("cat1");
		Dog dog1 = (Dog)context.getBean("dog1");
		Person person1 = (Person)context.getBean("person1");
		
		System.out.println(cat1.getDetails());
		System.out.println(dog1.getDetails());
		System.out.println(person1.getDetails());
	}
}
