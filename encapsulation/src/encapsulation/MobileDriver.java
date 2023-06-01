package encapsulation;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1=new Mobile("White","samsung",30000,new Battery(1234,"India"));
		
		System.out.println(m1.Color);
		System.out.println(m1.MobileCompany);
		System.out.println(m1.price);
		System.out.println(m1.b.Battery_company);
		System.out.println(m1.b.BatteryNO);
	}
}
