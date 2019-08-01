package com.javalec.JAVA_DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);	//container with annotation
		
									   /* ID (sub-class), super class */
		Student student1 = ctx.getBean("student1", Student.class);	//student 1
		System.out.println("Student 1__________________________________________");
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Hobbies: " + student1.getHobbies());
		System.out.println("Height: " + student1.getHeight());
		System.out.println("Weight: " + student1.getWeight());
		System.out.println();
		
		Student student2 = ctx.getBean("student2", Student.class);	//student 2
		System.out.println("Student 2__________________________________________");
		System.out.println("Name: " + student2.getName());
		System.out.println("Age: " + student2.getAge());
		System.out.println("Hobbies: " + student2.getHobbies());
		System.out.println("Height: " + student2.getHeight());
		System.out.println("Weight: " + student2.getWeight());
		System.out.println();
		
		/*
		 a name of an instance can vary in declaring but the source names to get beans should be correct like: 
		 Family myFamily1 = ctx.getBean("myFamily", Family.class); */
		
		//however, by convention -I think-, unless the config java class does not have more than one ID,
		//its better to have the same instance name as the ID in the config java class as shown below		
		Family myFamily = ctx.getBean("myFamily", Family.class);
		System.out.println("Family__________________________________________");
		System.out.println("Father's name: " + myFamily.getFatherName());
		System.out.println("Mather's name: " + myFamily.getMotherName());
		System.out.println("Sister's name: " + myFamily.getSisterName());
		System.out.println("Brother's name: " + myFamily.getBrotherName());
		
		
		ctx.close();
		
		

	}	

}
