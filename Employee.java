package oops;

import java.util.Scanner;

public class Employee {
	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int employeeSalary;
	
	public void takeSalary() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ID");
		employeeId = in.nextInt();
		
		System.out.println("Enter Name");
		employeeName = in.next();
		
		System.out.println("Enter Address");
		employeeAddress = in.next();
		
		System.out.println("Enter Salary");
		employeeSalary = in.nextInt();
	}
	
	public void printEmployeeDetails() {
		System.out.println("ID : " + employeeId);
		System.out.println("Name : "+ employeeName);
		System.out.println("Address : "+ employeeAddress);
		System.out.println("Salary : "+ employeeSalary);
	}
}
