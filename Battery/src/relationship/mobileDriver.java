package relationship;

public class mobileDriver {
	public static void main(String[] args) {
		mobile m1=new mobile("white","Samsung",5000,new Battery(12345,"India"));
		System.out.println(m1.Company);
		System.out.println(m1.Color);
		System.out.println(m1.price);
		System.out.println(m1.b.BatteryNumber);
		System.out.println(m1.b.Company);
	}

}
