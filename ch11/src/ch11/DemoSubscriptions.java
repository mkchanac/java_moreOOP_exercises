package ch11;

public class DemoSubscriptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PhysicalNewspaperSubscription one = new PhysicalNewspaperSubscription();
		one.setAddress("Rhythm Garden, Block , 16/F, Flat E");
		one.setName("CMK");
		System.out.println(one.getAddress() + " " + one.getName() + " " + one.getRate() );
		
		OnlineNewspaperSubscription two = new OnlineNewspaperSubscription();
		two.setAddress("chan44567@gmail.com");
		two.setName("MK");
		System.out.println(two.getAddress() + " " + two.getName() + " " + two.getRate() );
		

	}

}
