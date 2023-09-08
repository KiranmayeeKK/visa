/**
 * 
 */
package com.visa.time.client;

import com.visa.time.entity.Time;

/**
 * @author kiran
 *
 */
public class TimeMain {
	
	public static void main(String[] args) {
		
		  Time t1 = new Time(3,45);
	        Time t2 = new Time(2,30);

	        Time t3 = Time.add(t1, t2);

	       System.out.println(t1.getHours() + " : " + t1.getMins()); // 3 : 45
	       System.out.println(t2.getHours() + " : " + t2.getMins()); // 2 : 30
	       System.out.println(t3.getHours() + " : " + t3.getMins()); // 6 : 15  
		
	}
	

}
