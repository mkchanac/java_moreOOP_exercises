package ch11;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		boolean valid = false;

		for (int i = 0; i < 10; i++) {
			if (address.contains(Integer.toString(i))) {
				valid = true;
			}
		}

		if (!valid) {
			System.out.println("Error, invalid address, subscription rate set to 0");
			this.rate = 0;
			this.address = "Invalid address";
		} else {
			System.out.println("Valid address, subscription rate set to $15");
			this.rate = 15;
			this.address = address;
		}

	}

}
