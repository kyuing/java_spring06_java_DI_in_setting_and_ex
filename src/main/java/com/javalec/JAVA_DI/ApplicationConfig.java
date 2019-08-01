package com.javalec.JAVA_DI;

import java.util.ArrayList;

//import org.springframework.context.annotation.Configuration; this doesn't work
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


@Configurable
public class ApplicationConfig {

	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();	//should you declare ArrayList first so that it could function as a parameter in the specified constructor
		hobbies.add("JAVA Programming");
		hobbies.add("Sleeping");
		
		//the specified constructor in Student class "public Student(String name, int age, ArrayList<String> hobbies)"
		Student student = new Student("Kyu", 20, hobbies);
		
		student.setHeight(177);	//value for setHeight method in Student class
		student.setWeight(77);	//value for setWeight method in Student class
		
		return student;	//procedures in returning:  student == local level -> student1() == method (sub-class or ID) level -> class level
		
	}
	
	@Bean
	public Student student2() {
		
		//the same way as above
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("Flicking Facebook");
		hobbies.add("being an attention whore");
		
		Student student = new Student("Rey", 25, hobbies);
		student.setHeight(197);
		student.setWeight(45);
		
		return student;
		
	}
	
	@Bean
	public Family myFamily() {
		
		Family family = new Family("Tesco", "Lidl"); //we've got the specified constructor "public Family(String fatherName, String motherName)"
		
		//and we have two setters for sis name and bro name
		family.setSisterName("Lidlia");
		family.setBrotherName("Tesco Junior");
		
		return family;
		
	}
}
