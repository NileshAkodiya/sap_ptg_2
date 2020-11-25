package com.yash.classdemo1;

public class Mobile extends Product{
	
	int cameraPixels;
	String processor;

	Mobile(int pId, String name, double price, int cameraPixels, String processor) {
		super(pId, name, price);
		this.cameraPixels=cameraPixels;
		this.processor=processor;
	}
	Mobile(int pId, String name, double price, int qty, int cameraPixels, String processor) {
		super(pId, name, price,qty);
		this.cameraPixels=cameraPixels;
		this.processor=processor;
	}
	
	void getDetails() {
		System.out.print("Product Name: "+name);
		System.out.print(", Mobile Id: "+pId);
		System.out.print(", Mobile Price: "+price);
		System.out.print(", Mobile Quantity: "+qty);
		System.out.print(", Mobile CameraPixels: "+cameraPixels+"MP");
		System.out.println(", Mobile Processor: "+processor);
		System.out.println();
	}

}
