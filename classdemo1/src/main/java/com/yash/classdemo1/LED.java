package com.yash.classdemo1;

public class LED extends Product {

	int size;
	String isSmart;
	
	LED(int pId, String name, double price, int size, String isSmart) {
		super(pId, name, price);
		this.size=size;
		this.isSmart=isSmart;
	}

	void getDetails() {
		System.out.print("Product Name: "+name);
		System.out.print(", "+name +" Id: "+pId);
		System.out.print(", "+name +" Price: "+price);
		System.out.print(", "+name +" Quantity: "+qty);
		System.out.print(", "+name +" size: "+size+" inches");
		System.out.println(", "+name +" isSmart: "+isSmart);
		System.out.println();
		
	}
}
