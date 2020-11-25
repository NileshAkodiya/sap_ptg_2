package com.yash.classdemo1;

public class EarPhone extends Product {
	
	String type;

	EarPhone(int pId, String name, double price, int qty, String type) {
		super(pId, name, price, qty);
		this.type=type;
	}
	void getDetails() {
		System.out.print("Product Name: "+name);
		System.out.print(", "+name +" Id: "+pId);
		System.out.print(", "+name +" Price: "+price);
		System.out.print(", "+name +" Quantity: "+qty);
		System.out.println(", "+name +" Type: "+type);
		System.out.println();
		
	}

}