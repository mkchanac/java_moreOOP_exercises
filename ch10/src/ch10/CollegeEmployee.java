package ch10;

import java.util.Scanner;

public class CollegeEmployee extends Person {
	private String SSNum;
	private double annualSalary;
	private String department;

	public CollegeEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAllData() {
		// TODO Auto-generated method stub
		super.setAllData();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Social Security Number: ");
		this.SSNum = input.nextLine();
		System.out.println("Enter your Annual Salary: ");
		this.annualSalary = input.nextDouble();
		input.nextLine();
		System.out.println("Enter your Department: ");
		this.department = input.nextLine();

	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.println("Social Security Number: " + SSNum + "\nAnnual Salary: " + annualSalary + "\nDepartment: "
				+ department);

	}

}
