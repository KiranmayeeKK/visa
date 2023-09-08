/**
 * 
 */
package com.visa.comparable.util;

/**
 * @author kiran
 *
 */
public class Utility {
	
	public static void sort(Comparable[] elements) {
		
		for( int i =0 ; i < elements.length; i++) {
			for(int j = i+1; j < elements.length; j++ ) {
				if(elements[i].compareTo(elements[j]) > 0)
				{
					Comparable elem = elements[i];
				elements[i] = elements[j];
				elements[j] = elem;
				}
			}
		}
	}
	

}
