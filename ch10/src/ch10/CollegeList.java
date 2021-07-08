package ch10;

import java.util.Scanner;

public class CollegeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person = new Person[14];
		CollegeEmployee[] cEmp = new CollegeEmployee[4];
		Faculty[] facu = new Faculty[3];
		Student[] stud = new Student[7];
		Scanner input = new Scanner(System.in);
		String userChoice = "";
		int i = 0;
		int cNum = 0;
		int fNum = 0;
		int sNum = 0;
		boolean quit = false;

		while (!quit) {
			System.out.println("Enter (C,F, or S): <Q to quit>");
			userChoice = input.nextLine().toUpperCase();

			if (userChoice.equals("Q")) {
				quit = true;
			} else if (userChoice.equals("C")) {
				if (cNum < 4) {
					person[i] = new CollegeEmployee();
					cEmp[cNum] = (CollegeEmployee) person[i];
					cNum++;
				} else {
					System.out.println("Only 4 college employees allowed");
				}

			} else if (userChoice.equals("F")) {
				if (fNum < 3) {
					person[i] = new Faculty();
					facu[fNum] = (Faculty) person[i];
					fNum++;

				} else {
					System.out.println("Only 3 faculties allowed");
				}

			} else if (userChoice.equals("S")) {

				if (sNum < 7) {
					person[i] = new Student();
					stud[sNum] = (Student) person[i];
					sNum++;

				} else {
					System.out.println("Only 7 students allowed");
				}

			} else {
				System.out.println("No such type of person");
			}

		}

		// CFS

		System.out.println("Report Listing each group of person");
		System.out.println("=======================================");
		System.out.println("College Employee");
		if (cEmp != null) {
			for (CollegeEmployee cE : cEmp) {
				if (cE != null) {
					cE.displayAll();
				}
			}
		}
		if (facu != null) {
			System.out.println("Faculty");
			for (Faculty f : facu) {
				if (f != null) {
					f.displayAll();
				}
			}
		}
		if (stud != null) {
			System.out.println("Student");
			for (Student s : stud) {
				if (s != null) {
					s.displayAll();
				}
			}
		}
	}

}
