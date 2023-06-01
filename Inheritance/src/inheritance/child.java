package inheritance;

public class child extends Parent {
	int b=200;
	public void fromChild()
	{
		System.out.println("hello from child class");
	}
	
	public static void main(String[] args) {
		//Parent p1=new Parent ();
		child c1=new child();
		c1.fromParent();
		System.out.println(c1.a);
		
		//child c1=new child();
		c1.fromChild();
		System.out.println(c1.b);
		
		Parent p1=new Parent ();
		p1.fromParent();
		System.out.println(p1.a);
	}
}
