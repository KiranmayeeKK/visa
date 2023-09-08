/**
 * 
 */
package com.visa.prj.entity;

/** This is an entity class to represent book entity
 * @author kiran
 * @version 1.0.0
 */
public class Book {
	
	private String title;
	private double price;
	public Book() {
	}
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	

}
