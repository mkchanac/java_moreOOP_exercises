package ch10;

import java.util.Scanner;

public class Faculty extends CollegeEmployee {
	private boolean isTenured; // perm

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAllData() {
		// TODO Auto-generated method stub
		super.setAllData();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you tenured? <Y or N>");
		if(input.nextLine() == "Y") {
			this.isTenured = true;
		} else {
			this.isTenured = false;
		}

	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.println("Tenured: " + isTenured);
	}

}
