package ArrayProgram;

public class quiz {

	public static void Quiz(int n)
	{
		if(n==1)
		{
			return;
		}
		System.out.println(n+1);
		Quiz(n-1);
		System.out.println(n+1);
		
		
	}
	
	public static void main(String[] args) {
		Quiz(4);
	}
}
