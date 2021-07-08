package ch11;

public class GraduateStudent extends Student {

	public GraduateStudent(String studentID, String lastName) {
		super(studentID, lastName);
		this.setAnnualTuition(6000.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAnnualTuition(double annualTuition) {
		// TODO Auto-generated method stub
		this.annualTuition = annualTuition * 2;
	}

}
