package com.tieto.thiskeyword;

//this key word is used to invoke the current class constructor.
public class ThisDemo2 {

	ThisDemo2()
	{
	System.out.println("this is demo");
	}
	ThisDemo2(int x)
	{
		this();
	}
	public static void main(String[] args) {
		
 ThisDemo2 d = new ThisDemo2(5);
	}

}
