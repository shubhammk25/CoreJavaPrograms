package exception;
//ExceptionHandling is done with try{} and catch{} blocks
public class ExceptionHandling {
	
	public static void main(String[] args) {
		String s1=null;
		System.out.println("main start");
		try
		{
			System.out.println(s1.length());
		}
									//exception handling with NullPointerException--> exception occurs but handled
		catch(NullPointerException t)//if we write wrong exception-name then also exception occurs --> ecception occurs but not handled
		{
			System.out.println("cannot access null value");
		}
		System.out.println("main end");
	}

}
