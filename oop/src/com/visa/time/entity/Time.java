/**
 * 
 */
package com.visa.time.entity;

/**
 * @author kiran
 *
 */
public class Time {

	private int hours;
	private int mins;
	
	public Time() {
	}
	
	public Time(int hours, int mins) {
		this.hours = hours;
		this.mins = mins;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the mins
	 */
	public int getMins() {
		return mins;
	}

	/**
	 * @param mins the mins to set
	 */
	public void setMins(int mins) {
		this.mins = mins;
	}

	public static Time add(Time t1, Time t2) {
		
		Time time = new Time();
		time.setMins((t1.getMins()+t2.getMins()) % 60);
		time.setHours(t1.getHours()+t2.getHours() +(t1.getMins()+t2.getMins()) /60);
		return time;
	}
	
	
}
