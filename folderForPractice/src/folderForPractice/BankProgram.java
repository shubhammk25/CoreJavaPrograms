package folderForPractice;
import java.util.Scanner;
import java.util.*;
public class BankProgram {

	static int accNo=10001;
	float amt;
	
	public void display()
	{
		System.out.println("User account Number :"+accNo);
		System.out.println("Current Amount :"+amt);
	}
	
	public void getamt()
	{
		System.out.println("Current Balance :"+amt);
	}
	
	public void withdraw(float x)
	{
		if(amt<=x || amt==1000)
			System.out.println("Sorry you can't withdraw");
		else
			amt=amt-x;
			System.out.println("amount withdraw :"+x);
			System.out.println("After Withdrawal:"+x);
			getamt();
	}
	
	public void deposit(float x)
	{
		if(x==0.0)
			System.out.println("0 can't be Deposited");
		else
			amt+=x;
			System.out.println("After deposition");
			getamt();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankProgram b=new BankProgram();
		b.deposit(0);
		b.withdraw(120.5f);
		b.display();
		System.out.println("..........");
		BankProgram bk=new BankProgram();
		bk.deposit(1000);
		bk.withdraw(1100);
	}
	
	
}
