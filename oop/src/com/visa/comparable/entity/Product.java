/**
 * 
 */
package com.visa.comparable.entity;

/**
 * @author kiran
 *
 */
public abstract class Product implements Comparable{

	private int id;
	private String name;
	private double price;
	
	public Product() {
		
		System.out.println("P1");
		this.price = 500;
		
	}
	public Product(int id, String name, double price) {
		System.out.println("P2");
		
		this.id= id;
		
		this.name = name;
		
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	public abstract  boolean isExpensive();
	@Override
	public int compareTo(Object o) {
		Product prod = (Product) o;
		if(this.getPrice() > prod.getPrice())
			return 1;
		else
			return 0;
	}
	
	
	
}
