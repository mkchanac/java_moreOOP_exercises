package ch11;

public class PersonalLoan extends Loan {

	public PersonalLoan(String loanNumber, String lastName, double loanAmount, String term) {
		super(loanNumber, lastName, loanAmount, term);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setInterestRate(double currentPrimeInterestRate) {
		this.interestRate = currentPrimeInterestRate + 0.02;
	}

}
