package NumberProgramms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n,a=0,b=1;
		System.out.println("enter a number:");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		System.out.println(" the first " +n+ "fibonacci numbers are :-");
		
		for (int i=1;i<=n-2 ;i++ )
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(" "+sum);
		}
	}
}
