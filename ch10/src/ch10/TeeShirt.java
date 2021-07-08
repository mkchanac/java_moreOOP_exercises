package ch10;

public class TeeShirt {

	private int orderNum;
	private String size;
	private String color;
	private double price;

	public TeeShirt(int orderNum, String size, String color) {
		this.orderNum = orderNum;
		this.size = size;
		this.color = color;
		if (this.size.equals("XXL") || this.size.equals("XXXL")) {
			this.price = 22.99;
		} else {
			this.price = 19.99;
		}
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
