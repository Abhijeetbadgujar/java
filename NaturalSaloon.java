package com.xworkz.extend.shop;

public class NaturalSaloon extends Saloon {
	public String name="X";
	public String location="jp nagar";
	
	public NaturalSaloon() {
		this("Xworkz");//super or this
		System.out.println("This is xworkz");
	}
	
	public NaturalSaloon(String name) {
		super();
		
		System.out.println("Name is:"+name);
	}
	
}
