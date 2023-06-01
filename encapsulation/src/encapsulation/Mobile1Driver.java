package encapsulation;

public class Mobile1Driver {
	
	public static void main(String[] args) {
		Mobile1 m1=new Mobile1("white","vivo");
		m1.printAttributes(new Sim("Jio","RED",12345) );
	}
		
}
