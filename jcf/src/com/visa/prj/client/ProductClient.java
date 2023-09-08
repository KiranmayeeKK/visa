package com.visa.prj.client;

import java.util.Arrays;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.Tv;

public class ProductClient {
	
	public static void main(String[] args) {
		
		Product[] products = new Product[4]; // Array of Pointers
		products[0] = new Mobile(345, "iPhone 14", 89000.00, "4G"); // up casting
		products[1] = new Tv(42, "Onida KyThunder", 3500.00, "CRT"); // up casting
		products[2] = new Tv(62, "sony Bravia", 2_35_000.00, "OLED");
		products[3] = new Mobile(922, "Samsung Fold", 129000.00, "4G");
		
		System.out.println("--sorting by id--");
		Arrays.sort(products);
		
		for(Product p : products) {
			System.out.println(p.getId() + ", " + p.getName());
		}
		
		System.out.println("--sorting by price--");
		Arrays.sort(products, (o1,o2) ->  (int) (o1.getPrice()-o2.getPrice()) );
		
		for(Product p : products) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}
		
		System.out.println("--sorting by name--");
		Arrays.sort(products, (o1,o2) ->  o1.getName().compareTo(o2.getName()));
		
		for(Product p : products) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}
	}

}
