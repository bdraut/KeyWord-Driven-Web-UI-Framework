package com.tieto.employee;

public class Employee {

	public int empID;
	String empName;
	double empSalary;
	public String CompanyName;

	public static void printEmplyoeeDetails(Employee emp) {
		System.out.println(emp.empID);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(emp.CompanyName);
	}

	public static Employee getEmployeeWIthHighSalary(Employee e1, Employee e2) {
		if (e1.empSalary > e2.empSalary) {

			return e1;
		} else {

			return e2;
		}

	}

}
