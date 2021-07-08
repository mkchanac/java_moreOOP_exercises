package ch10;

public class Horse {
	private String name;
	private String color;
	private String birthYear;

	public Horse(String name, String color, String birthYear) {
		this.name = name;
		this.color = color;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
