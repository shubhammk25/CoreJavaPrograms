package Interface;

public interface Int_2 extends Int_1 {

	public static void test()
	{
		System.out.println("hello from test() int2");
	}
	
	public static void main(String[] args) {
		Int_1.test();
		Int_2.test();
	}
	
}
