package polymorphisam;
//method Shadowing
// subclass and superclass contains same name method signature  known as method shadowing
//(execution depends on reference variable not on object passed )
public class Child2 extends Parent2 {
	public static void m1()
	{
	System.out.println("hello from child m1()");	
	}
	public static void main(String[] args) {
		Parent2 p1=new Parent2();
		p1.m1();//from parent
		
		Child2 c1=new Child2();
		c1.m1();//from child
		
		Parent2 p2=new Parent2();
		p2.m1();//from parent
		
		
	}
}
