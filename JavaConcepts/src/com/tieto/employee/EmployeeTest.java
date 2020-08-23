package com.tieto.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		emp1.empID = 101;
		emp1.empName = "John";
		emp1.CompanyName = "Tieto";
		emp1.empSalary = 5000;

		Employee emp2 = new Employee();
		emp2.empID = 102;
		emp2.empName = "Paul";
		emp2.CompanyName = "Tieto";
		emp2.empSalary = 8000;

//	Employee.printEmplyoeeDetails(emp1);  // Pass by refference
//	Employee.printEmplyoeeDetails(emp2); 

		Employee HighSalaryEmp = Employee.getEmployeeWIthHighSalary(emp1, emp2);

		Employee.printEmplyoeeDetails(HighSalaryEmp);

	}

}
