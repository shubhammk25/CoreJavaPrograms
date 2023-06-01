package ArrayProgram;

import java.util.Scanner;

public class Fibonaccii {

	public static void main(String[] args) {
		int n,a=0,b=1;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("first "+n+" Fibonacci number are: ");
		System.out.print(a+" "+b);
		for(int i=1;i<=n-2;i++)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
		}
	}
	
}
