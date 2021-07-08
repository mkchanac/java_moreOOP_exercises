package ch11;

public class UndergraduateStudent extends Student {

	public UndergraduateStudent(String studentID, String lastName) {
		super(studentID, lastName);
		this.setAnnualTuition(4000.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAnnualTuition(double annualTuition) {
		// TODO Auto-generated method stub
		this.annualTuition = annualTuition * 2;

	}

}
