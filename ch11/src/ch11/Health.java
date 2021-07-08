package ch11;

public class Health extends Insurance {

	

	public Health() {
		super("Health");
		this.setCost();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setCost() {
		// TODO Auto-generated method stub
		this.monthlyPrice = 196;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Type: " + this.type + "\tMonthly Price: " + this.monthlyPrice);
		
	}
	
	

}
