package NumberProgramms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int sum=0;
		for (int i = 1; i < n/2; i++) {
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println("The number is Perfect Number..");
		}else {
			System.out.println("The number is not Perfect Number..");
		}
	}
}
