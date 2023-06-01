package exception;

public class FinallyKeyword {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
		int res=a/b;
		System.out.println(res);
		}
		catch(ClassCastException c)//even we given wrong exceptionType it will work
		{
			System.out.println("cant divide by zero with any number");
		}
		finally
		{
			System.out.println("Finally block executes even exception handled or not handled");
		}
		
	}
	
}
