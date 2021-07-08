package ch10;

public class DemoTees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeeShirt one = new TeeShirt(1,"M","Yellow");
		TeeShirt two = new TeeShirt(2,"XXL","White");
		CustomTee three = new CustomTee(3,"S","Red");
		three.setSloganRequested("I love HK");
		CustomTee four = new CustomTee(3,"XXXL","Black");
		three.setSloganRequested("Free HK");
		System.out.println(one.getPrice());
		System.out.println(one.getColor());
		System.out.println(one.getSize());
		
		System.out.println(two.getPrice());
		System.out.println(two.getColor());
		System.out.println(two.getSize());
		
		System.out.println(three.getPrice());
		System.out.println(three.getColor());
		System.out.println(three.getSize());
		System.out.println(three.getSlogan());

	}

}
