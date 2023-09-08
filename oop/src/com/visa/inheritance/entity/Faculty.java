/**
 * 
 */
package com.visa.inheritance.entity;

/**
 * @author kiran
 *
 */
public class Faculty extends Person {
	
	double rating;
	String subject;
	
	public Faculty() {
	}

	public Faculty(String firstName, String lastName, String subject,  double rating) {
		super(firstName, lastName);
		this.rating = rating;
		this.subject = subject;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public boolean isOutstanding() {
		return rating>4.25 ? true : false;
	}
	

}
