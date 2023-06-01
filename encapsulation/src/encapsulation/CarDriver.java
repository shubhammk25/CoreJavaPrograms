package encapsulation;

public class CarDriver {
	
	public static void main(String[] args) {
		Car c1=new Car("bmw","white",1000000, new Engine(1234,"tml"));
		
		System.out.println(c1.CarColor);
		System.out.println(c1.CarCompany);
		System.out.println(c1.price);
		System.out.println(c1.e.EngineCompany);
		System.out.println(c1.e.EngineNo);
	}
	
}
