package ch11;

public class OnlineNewspaperSubscription extends NewspaperSubscription {

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		boolean valid = false;

		if (address.contains("@")) {
			valid = true;
		}

		if (!valid) {
			System.out.println("Error, invalid address, subscription rate set to 0");
			this.rate = 0;
			this.address = "Invalid address";
		} else {
			System.out.println("Valid address, subscription rate set to $9");
			this.rate = 9;
			this.address = address;
		}

	}

}
