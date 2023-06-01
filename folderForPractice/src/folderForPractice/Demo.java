package folderForPractice;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,dummy=n;
		while (n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if (rev==dummy)
		{
			System.out.println("it is palindrome number");
		}
		else 
		{
			System.out.println("it is not a palindrome number");						
		}		
		
		
		
	}
	
}
		
	
