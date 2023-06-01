package NumberProgramms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0,dummy=n;
		
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==dummy)
		{
			System.out.println("The number is palindrome..");
		}else {
			System.out.println("The number is not Palindrome..");
		}
	}
}
