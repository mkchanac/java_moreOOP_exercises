package ch11;

public abstract class Student {
	protected String studentID;
	protected String lastName;
	protected double annualTuition;

	public Student(String studentID, String lastName) {
		this.studentID = studentID;
		this.lastName = lastName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAnnualTuition() {
		return annualTuition;
	}

	public abstract void setAnnualTuition(double annualTuition);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student ID: " + studentID + "\tLast Name: " + lastName + "\tAnnual Tuition: " + annualTuition;
	}

}
