package polymorphisam;
//runtime polymorphisam(JVM handles runtime polymorphisam)
//only one way i.e method overriding
//method overriding is only for nonStatic methods like method shadwoing 
//( execution Depends on object passed not on refernece varaible)

public class Child3 extends Parent3{
	public void m1()
	{
		System.out.println("hello from child m1()");
	}
	public static void main(String[] args) {
		Parent3 p1=new Parent3();
		p1.m1();//from parent
		
		Child3 c1=new Child3();
		c1.m1();//from child
		
		Parent3 p2=new Child3();//downcasting
		p2.m1();//from child
	}
}
