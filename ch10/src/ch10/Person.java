package ch10;

import java.util.Scanner;

public class Person {
	private String firstName;
	private String lastName;
	private String streetAdd;
	private String zipCode;
	private String phoneNum;

	public Person() {
		setAllData();
	}

	public void setAllData() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your First Name: ");
		this.firstName = input.nextLine();
		System.out.println("Enter your Last Name: ");
		this.lastName = input.nextLine();
		System.out.println("Enter your Street Address: ");
		this.streetAdd = input.nextLine();
		System.out.println("Enter your Zip code: ");
		this.zipCode = input.nextLine();
		System.out.println("Enter your Phone Number: ");
		this.phoneNum = input.nextLine();

	}

	public void displayAll() {
		System.out.println("\nName: " + firstName + " " + lastName + "\nStreet Address: " + streetAdd + "\nZip Code: "
				+ zipCode + "\nPhone Number: " + phoneNum);

	}

}
