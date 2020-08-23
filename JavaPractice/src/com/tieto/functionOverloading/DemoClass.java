package com.tieto.functionOverloading;

public class DemoClass {
	
	public void getData()
	{
		System.out.println("I am in getData");
	}
	
	public void setData()
	{
		System.out.println("I am in setData");
	}
	
	public void setdata(String name)
	{
	System.out.println(name);
	}

	public static void main(String[] args) {

		DemoClass d = new DemoClass();
		d.getData();
		d.setData();
		d.setdata("Bhushan");
		
	}

}
