package inheritance;
//Hierarchical inheritance
public class EHirarchical extends A {
	
	public void fromE()
	{
		System.out.println("Hello from E(child of A)");
	}
	
	public static void main(String[] args) {
		A a1=new A();
		a1.fromA();
		
		DHirarchical d1=new DHirarchical();
		d1.fromA();
		d1.fromD();
		
		EHirarchical c1=new EHirarchical();
		c1.fromA();
		c1.fromE();
		
	}
}
