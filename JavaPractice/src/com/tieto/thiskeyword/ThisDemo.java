package com.tieto.thiskeyword;

// This keyowrd is used to invoke the method of current class implicitly.

public class ThisDemo {
	
	void a()
	{
		System.out.println("I am in A");
	}
	
	void c()
	{
		System.out.println("I am in C");
	}
	
	void b() {
		System.out.println("I am in B");
		this.a();
		c();
	}

	public static void main(String[] args) {
		
		ThisDemo d = new ThisDemo();
		d.b();
	}

}
