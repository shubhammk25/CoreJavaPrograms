package encapsulation;

public class Car {

	String CarCompany;
	String CarColor;
	double price;
	
	Engine e;

	public Car(String carCompany, String carColor, double price, Engine e) {
		super();
		CarCompany = carCompany;
		CarColor = carColor;
		this.price = price;
		this.e = e;
	}
	
	
	
}
