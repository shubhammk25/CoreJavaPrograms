package Interface;

public interface Int_4 extends Int_1,Int_3{

	public static void test()
	{
		System.out.println("hello from test() int4");
	}
	
	public static void main(String[] args) {
		Int_1.test();
		Int_3.test();
		Int_4.test();
	}
}
