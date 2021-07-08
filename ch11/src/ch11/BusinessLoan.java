package ch11;

public class BusinessLoan extends Loan {

	public BusinessLoan(String loanNumber, String lastName, double loanAmount, String term) {
		super(loanNumber, lastName, loanAmount, term);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setInterestRate(double currentPrimeInterestRate) {
		// TODO Auto-generated method stub
		this.interestRate = currentPrimeInterestRate + 0.01;
	}
	
	
	
	
	
	
	
}
