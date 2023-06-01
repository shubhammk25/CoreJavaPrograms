package exception;
//exception occured but not handled by Calling method
public class NotHandledByCallingMethod {

	public static void main(String[] args) {
		System.out.println("MS");
		add();//called method but throws the exception
		/*try
		{
			add();
		}
		catch(ArithmeticException b)
		{
			System.out.println("somethimg went wrong");
		}*/
		System.out.println("ME");
	}
	
	public static void add()
	/*public static void add() throws ArithmeticException,ClassCastException,NullPointerException*/
	{					//we use throws keyword to declare the exception--we can parent exception if we dont know exception type
		int a=10/0;
		System.out.println(a);//Arithmetic Exception
	}
}
