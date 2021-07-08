package ch10;

public class DemoHorses {

	public static void main(String[] args) {
		Horse horse = new Horse("horse", "brown", "2015");
		RaceHorse raceHorse = new RaceHorse("horse", "white", "2019");

		raceHorse.setRacesCompeted(100);
		System.out.println(horse.getBirthYear());
		System.out.println(raceHorse.getRacesCompeted());
	}

}
