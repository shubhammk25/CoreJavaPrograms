package Interface;

public class Int_7 extends Int_6 implements Int_1,Int_3 {

	public  void temp()
	{
		System.out.println("hello form temp() int7class nonstatic ");
	}
	public static void test()
	{
		System.out.println("hello form test() int7class static");
	}

	public static void main(String[] args) {
		Int_6.test();//static from classint6
		Int_1.test();//static from interface int1
		Int_1.test();//static from interface int3
		Int_7.test();//static from class int7(inheriting class)
		Int_6 i=new Int_6();//creating object of classint6
		i.temp();//nonstatic from class int 6
		Int_7 i1=(Int_7) i;//downcasting
		i1.temp();//nonstatic from class int7(inheritin class)
		
	}
}
