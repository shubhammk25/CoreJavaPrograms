package encapsulation;

public class Mobile1 {

	String MobileColor;
	String Brand;
	
	Sim s;

	public Mobile1(String mobileColor, String brand) {
		super();
		MobileColor = mobileColor;
		Brand = brand;
	}
	
	public void printAttributes(Sim s)
	{
		this.s=s;
		System.out.println(s.serviceProvider);
		System.out.println(s.SimNo);
		System.out.println(s.Color);
		System.out.println(Brand);
		System.out.println(MobileColor);
	}
	
}
