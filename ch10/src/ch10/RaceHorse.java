package ch10;

public class RaceHorse extends Horse {
	private int racesCompeted;

	public RaceHorse(String name, String color, String birthYear) {
		super(name, color, birthYear);
		// TODO Auto-generated constructor stub
	}

	public int getRacesCompeted() {
		return racesCompeted;
	}

	public void setRacesCompeted(int racesCompeted) {
		this.racesCompeted = racesCompeted;
	}

}
