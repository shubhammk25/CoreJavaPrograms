package Interface;

public class Int_5 implements Int_1,Int_3{
	
	public static void test()
	{
		System.out.println("hello from test() int5");
	}
	
	public static void main(String[] args) {
		Int_1.test();
		Int_3.test();
		Int_5.test();
	}

}
