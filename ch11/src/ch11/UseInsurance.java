package ch11;

import java.util.Scanner;

public class UseInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Health or Life type: ");
		String choice = input.nextLine();
		if (choice.equals("Health")) {
			Health health = new Health();
			health.display();
		} else if (choice.equals("Life")){
			Life life = new Life();
			life.display();
		}

	}

}
