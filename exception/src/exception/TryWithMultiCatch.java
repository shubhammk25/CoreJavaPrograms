package exception;
//try block can be present with multiple blocks...
//ORDER OF CATCH{}--->child at TOP & parent at BOTTOM
//if we not declaring parentException in catch{} then it shuld be in any order....It works like switch block.
public class TryWithMultiCatch {
	
	public static void main(String[] args) {
		String s1=null;
		System.out.println("main start");
		try
		{
			System.out.println(s1.length());
		}
		catch(ArithmeticException t)
		{
			System.out.println("cannot divide by zero");
		}						
		catch(NullPointerException t)
		{
			System.out.println("cannot access null value");
		}
		catch(ClassCastException t)
		{
			System.out.println("cannot access member");
		}
		System.out.println("main end");
	}
}
	