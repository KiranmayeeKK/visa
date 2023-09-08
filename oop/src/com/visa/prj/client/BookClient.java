/**
 * 
 */
package com.visa.prj.client;

import com.visa.prj.entity.Book;

/**
 * @author kiran
 *
 */
public class BookClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Book javaBook = new Book("Head First Java", 540.00);
		
		Book reactBook = new Book("React Ref", 500.00);
		
		javaBook.setPrice(578.00);
		
		System.out.println("Title: " + javaBook.getTitle());
		
		System.out.println("Price: " + javaBook.getPrice());
		
		System.out.println(reactBook);
	}

}
