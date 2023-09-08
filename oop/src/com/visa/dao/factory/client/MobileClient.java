package com.visa.dao.factory.client;

import com.visa.dao.factory.entity.Mobile;
import com.visa.dao.factory.entity.MobileDao;
import com.visa.dao.factory.factory.MobileDaoFactory;

public class MobileClient {

	public static void main(String[] args) {
		Mobile m = new Mobile(345, "iPhone 14", 89000.00, "4G"); 
		
//		MobileDao mobileDao = new MobileDaoDBImpl();
//		MobileDao mobileDao = new MobileDaoMongoImpl();
		
		MobileDao mobileDao = MobileDaoFactory.getMobileDao();
		mobileDao.addMobile(m);
	}
}
