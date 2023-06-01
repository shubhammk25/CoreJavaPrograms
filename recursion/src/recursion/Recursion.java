package recursion;

public class Recursion {

	static void recursion(int n)
	{
		if (n==0) {
			return ;
		}
		System.out.println(n+" ");
		recursion(n-1);
	}
	
	static void iteration(int n)
	{
		for (int i = n; i >= 1; i--) {
			System.out.println(i+" ");
		}
	}
	
	public static void main(String[] args) {
		recursion(10);
		System.out.println();
		iteration(10);
	}
	
}
