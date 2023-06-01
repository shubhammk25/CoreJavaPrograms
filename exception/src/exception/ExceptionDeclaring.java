package exception;

public class ExceptionDeclaring {

	public static void main(String[] args) {
		/*add();//called method but throws the exception*/
		System.out.println("MS");
		try
		{
			add();
		}
		catch(ArithmeticException b)
		{
			System.out.println("somethimg went wrong");
		}
		System.out.println("ME");
	}
	
	/*public static void add()*/
	public static void add() throws ArithmeticException,ClassCastException,NullPointerException
	{					//we use throws keyword to declare the exception--we can use parent exception if we dont know exception type
		int a=10/0;
		System.out.println(a);//Arithmetic Exception
	}

	
}
