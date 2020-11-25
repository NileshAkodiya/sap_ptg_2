package com.yash.classdemo1;

public class Product {  //template class for product

	protected int pId;   //properties/data/attributes
	String name;		//instance variable
	//static double price;	//class variable
	double price;		//instance variable
	int qty=1;
	
	Product(int pId, String name, double price){
		this.pId=pId;
		this.name=name;
		this.price=price;
	}
	

	Product(int pId, String name, double price, int qty){
		this.pId=pId;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	void getDetails() {
		System.out.print("Product Name: "+name);
		System.out.print(", Product Id: "+pId);
		System.out.print(", Product Price: "+price);
		System.out.println(", Product Quantity: "+qty);
	}
	/*public static void main(String[] args) {
		Product product=new Product(101, "mobile", 15000);
		product.getDetails();
		Product product2=new Product(101, "mobile", 10000, 2);
		product2.getDetails();
		Product product3=new Product(101, "mobile", 1000, 10);
		product3.getDetails();

	}*/

}
