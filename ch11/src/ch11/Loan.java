package ch11;

public abstract class Loan implements LoanConstants {
	protected String loanNumber;
	protected String lastName;
	protected double loanAmount;
	protected double interestRate;
	protected String term;

	public Loan(String loanNumber, String lastName, double loanAmount, String term) {
		this.loanNumber = loanNumber;
		this.lastName = lastName;
		if (loanAmount <= MAX_LOAN_AMOUNT) {
			this.loanAmount = loanAmount;
		} else {
			System.out.println("Loan amount cannot > 100000");
		}
		if (term.equals("short-term") || term.equals("medium-term") || term.equals("long-term")) {
			this.term = term;
		} else {
			this.term = "short-term";
		}

	}

	public abstract void setInterestRate(double currentPrimeInterestRate);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return COMPANY_NAME + "\nLoan number: " + loanNumber + "\tLast name: " + lastName + "\tLoan Amount: "
				+ loanAmount + "\tInterest Rate: " + interestRate + "\tLoan Term: " + term;
	}

}
