package ch10;

import java.util.Scanner;

public class Student extends Person {
	private String major;
	private double gpa;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAllData() {
		// TODO Auto-generated method stub
		super.setAllData();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Major: ");
		this.major = input.nextLine();
		System.out.println("Enter your Grade Point Average: ");
		this.gpa = input.nextDouble();
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.println("Major: " + major + "\nGPA: " + gpa);
	}

}
