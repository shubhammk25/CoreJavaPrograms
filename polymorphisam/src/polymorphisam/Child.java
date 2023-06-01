package polymorphisam;

//Variable shadowing
public class Child extends Parent{
	int a=56;
	public static void main(String[] args) {
		Parent p1=new Parent();
		System.out.println(p1.a);//from Parent 35
		
		Child c1= new Child();
		System.out.println(c1.a);//from child 56
		
		Parent p2=new Child();//down casting
		System.out.println(p2.a);//from parent 35
	}
}
