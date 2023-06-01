package abstraction;

public class bike extends car {
	
	public void seater()
	{
		System.out.println("2 seater");
	}
	public void wheeler()
	{
		System.out.println("2 wheeler ");
	}

	public static void main(String[] args) {
		bike b1= new bike();
		b1.seater();
		b1.wheeler();
	}
}
