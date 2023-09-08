/**
 * 
 */
package com.visa.inheritance.entity;

/**
 * @author kiran
 *
 */
public class Student extends Person {
	
	String course;
	double gpa;
	
	
	public Student() {
	}


	public Student(String firstName, String lastName, String course, double gpa) {
		super(firstName, lastName);
		this.course = course;
		this.gpa = gpa;
	}


	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}


	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}


	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}


	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public boolean isOutstanding() {
		return gpa>8.0 ? true : false;
	}
	
	

}
