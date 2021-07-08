package ch10;

public class CustomTee extends TeeShirt {
	private String slogan;
	public CustomTee(int orderNum, String size, String color) {
		super(orderNum, size, color);
		// TODO Auto-generated constructor stub
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSloganRequested(String slogan) {
		this.slogan = slogan;
	}
}
