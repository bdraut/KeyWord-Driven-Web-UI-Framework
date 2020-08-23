package com.tieto.methods;

public class MethodsDemo {
	
	

	public static double areaOfCircle(int r) 
	{
		double area = 3.14*r*r;
		return area;
		
	}
	
	
	
	public static double areaOfTriangle(int base, int height) 
	{
		double area = (base*height)/2;
		return area;
		
	}
	public static void main(String[] args) {
		double result;
		// TODO Auto-generated method stub
	 result =	MethodsDemo.areaOfTriangle(4, 5);
		System.out.println(result);
		
		result = MethodsDemo.areaOfCircle(5);
		System.out.println("Area of circle " +result);

	}

}
