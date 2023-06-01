package inheritance;
//multilevel inheritance
public class C extends B {
	public void fromC()
	{
		System.out.println("Hello from C");
	}
	
	public static void main(String[] args) {
		A a1= new A();
		a1.fromA();
		
		B b1=new B();
		b1.fromB();
		b1.fromA();
		
		C c1=new C();
		c1.fromC();
		c1.fromB();
		c1.fromA();
	}

}
