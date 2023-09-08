/**
 * 
 */
package com.visa.dao.factory.entity;

/**
 * @author kiran
 *
 */
public class MobileDaoDBImpl implements MobileDao {


	@Override
	public void addMobile(Mobile m) {
		System.out.println("SQL store .." + m.getName());
	}

}
