package ch11;

public class StudentAtLarge extends Student {

	public StudentAtLarge(String studentID, String lastName) {
		super(studentID, lastName);
		setAnnualTuition(2000.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAnnualTuition(double annualTuition) {
		// TODO Auto-generated method stub
		this.annualTuition = annualTuition * 2;
	}

}
