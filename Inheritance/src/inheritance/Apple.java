package inheritance;
//example of up casting
public class Apple extends fruit {
	int b=34;
	public void fromApple()
	{
		System.out.println("hello i am from Apple child class");
	}
	public static void main(String[] args) {
		fruit f1= new Apple();//up casting
		System.out.println(f1.a);// by doing up casting you can access elements of parent class but not the child class
		f1.fromFruit();
		//System.out.println(f1.b);//here CTE will give, you can't access by up casting you need access down casting
		//f1.fromApple();
		
		Apple a1= (Apple) f1;// Down Casting---> you can't do down casting without doing up casting
		a1.fromApple();// once down casting is done you can access elements of child class
		System.out.println(a1.b);
	}
}
