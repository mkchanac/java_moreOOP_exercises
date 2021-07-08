package ch11;

public class Life extends Insurance {

	public Life() {
		super("Life");
		this.setCost();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setCost() {
		// TODO Auto-generated method stub
		this.monthlyPrice = 36;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Type: " + this.type + "\tMonthly Price: " + this.monthlyPrice);

	}

}
