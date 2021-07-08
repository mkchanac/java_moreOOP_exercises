package ch11;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Student[] student = new Student[6];

		for (int i = 0; i < student.length; i++) {

			System.out.println("Enter your student ID: ");
			String id = input.nextLine();
			System.out.println("Enter your student last name: ");
			String name = input.nextLine();
			System.out.println("Enter type of student <U - undergrad, G - graduate, L - large>: ");
			String type = input.nextLine().toUpperCase();
			if (type.equals("U")) {
				student[i] = new UndergraduateStudent(id, name);
			} else if (type.equals("G")) {
				student[i] = new GraduateStudent(id, name);
			} else if (type.equals("L")) {
				student[i] = new StudentAtLarge(id, name);
			} else {
				System.out.println("Invalid entry of student type");
			}

			System.out.println("================================================================");

		}

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}

	}

}
