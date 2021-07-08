package ch11;

import java.util.Scanner;

public class CreateLoans {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Loan[] loans = new Loan[5];

		boolean quit = false;
		int i = 0;

		while (!quit && i < 5) {
			System.out.println("Enter the current prime interesst rate: ");
			double currentPIR = input.nextDouble();
			input.nextLine();
			System.out.println("Enter the loan type <Business or Personal>");
			String type = input.nextLine();
			System.out.println("Enter the loan term < 1 / 3 / 5 year");
			int loanYear = input.nextInt();
			input.nextLine();
			String term = "";
			if (loanYear == 1) {
				term = "short-term";
			} else if (loanYear == 3) {
				term = "medium-term";
			} else if (loanYear == 5) {
				term = "long-term";
			}
			System.out.println("Enter loan number: ");
			String loanNum = input.nextLine();
			System.out.println("Enter last name: ");
			String lastName = input.nextLine();
			System.out.println("Enter loan amount < 100000: ");
			double loanAmount = input.nextDouble();
			input.nextLine();

			if (type.equals("Business")) {
				loans[i] = new BusinessLoan(loanNum, lastName, loanAmount, term);
				loans[i].setInterestRate(currentPIR);
				i++;
			} else if (type.equals("Personal")) {
				loans[i] = new PersonalLoan(loanNum, lastName, loanAmount, term);
				loans[i].setInterestRate(currentPIR);
				i++;
			}

		}

		for (Loan l : loans) {
			System.out.println(l.toString());
		}

	}

}
