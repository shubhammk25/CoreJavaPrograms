package encapsulation;

public class Mobile {

	String Color;
	String MobileCompany;
	double price;
	
	Battery b;

	public Mobile(String color, String mobileCompany, double price, Battery b) {
		Color = color;
		MobileCompany = mobileCompany;
		this.price = price;
		this.b = b;
	}
	
	
	
}
