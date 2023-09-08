/**
 * 
 */
package com.visa.dao.factory.entity;

/**
 * @author kiran
 *
 */
public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("MongoDB Store ..." + m.getName());
	}

}
