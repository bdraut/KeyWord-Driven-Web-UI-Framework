package com.tieto.functionOverloading;

public class SetGetDemo {

	String Name;
	int age;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void printAge() {
		System.out.println("Age is  " + age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {

		SetGetDemo s = new SetGetDemo();
		s.setName("Bhushan");
		System.out.println(s.getName());
		s.setAge(12);
		s.printAge();
	}

}
