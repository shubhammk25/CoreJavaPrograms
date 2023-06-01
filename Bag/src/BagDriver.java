
public class BagDriver {
	public static void main(String[] args) {
		Bag b1=new Bag();
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
		b1.setColor("Black");
		b1.setPrice(500);
		System.out.println("...........");
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
		b1.setColor("Red");
		System.out.println("........");
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
		
	}
}
