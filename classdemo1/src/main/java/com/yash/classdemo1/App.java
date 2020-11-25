package com.yash.classdemo1;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Mobile mobile=new Mobile(101, "mobile", 15000, 48, "Snap Dragon");
		mobile.getDetails();
		
		Mobile mobile2=new Mobile(102, "mobile", 10000, 2,16, "Qual Core");
		mobile2.getDetails();
		
		Mobile mobile3=new Mobile(103, "mobile", 1000, 10, 1, "Single Core");
		mobile3.getDetails();
		
		LED lED = new LED(1001, "LED",  30000, 43 , "Yes");
		lED.getDetails();
		lED = new LED(1001, "LED",  25000, 43 , "No");
		lED.getDetails();

	}
}
