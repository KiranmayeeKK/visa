package com.vis.inheritance.client;

import java.lang.reflect.Method;

import com.visa.inheritance.entity.Faculty;
import com.visa.inheritance.entity.Person;
import com.visa.inheritance.entity.Student;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person[] personList = new Person[5];
		
		personList[0] = new Student("kiran","mayee","CSE", 9.0);
		personList[1] = new Faculty("ram","sam","C", 4.5);
		personList[2] = new Faculty("tom","boy","Java", 4.2);
		personList[3] = new Student("katya","kol","IT", 7.8);
		personList[4] = new Student("mary","holy","CSE", 9.9);
		
		listOutStandingPersons(personList);
		
		printDetails(personList);
	}
	
	private static void listOutStandingPersons(Person[] personList) {
	
		System.out.println("outstanding persons:");
		for(Person person:personList ) {
			
			if(person.isOutstanding())
				System.out.println(person.getFirstName() + " " + person.getLastName());
			
		}
	}
	
	private static void printDetails(Person[] personList) {
		
		for(Person person: personList) {
			Method[] methods = person.getClass().getMethods();
			for (Method m : methods) {
				if (m.getName().startsWith("get")) {
					try {
						// p.getConnectivity();
						Object ret = m.invoke(person);
						System.out.println(m.getName().substring(3).toUpperCase() +  " : " + ret);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
			System.out.println("*****");
		}
	}
	

}

