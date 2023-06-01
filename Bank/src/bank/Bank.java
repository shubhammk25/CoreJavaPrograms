package bank;

import java.util.Scanner;

public class Bank {
	String bankName;

	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	account a;
	Scanner sc=new Scanner (System.in);
	
	public void createAccount(account a)
	{
		if(this.a==null)
		{
			this.a=a;
			System.out.println("Account Created Successfully");
		}
		else {
			System.out.println("can not login again");
		}
	}
	
	public void deleteAccount()
	{
		if (this.a==null) {
			/*
			try {
			throw new CreateAccountFirst();
			}
			catch(RuntimeException b)
			{
				System.out.println("you have to login first");
			}
			*/
			System.out.println("you have to login first");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter your account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter your password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				this.a=null;
				System.out.println("account deleted successfully");
			}
		}
	}
	
	public void displayUser()
	{
		if (this.a==null) {
			System.out.println("you have to create account");
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter account password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				System.out.println("Bank of India");
				System.out.println("Bank IFCD code : "+a.getIfsc());
				System.out.println("Bank Account Number :"+a.getAccountNumber());
				System.out.println("Bank Account Holder city:"+a.getCity());
				System.out.println("Bank Account Holder Name:"+a.getUserName());
				System.out.println("Bank Account Holder Contact Number:"+a.getContactNumber());
				System.out.println("Bank Account Balance:"+a.getBalance());
				System.out.println("Bank Account Holders Password:"+a.getPin());
				System.out.println("...................");
			}
			else {
				System.out.println("Incoorect password");
			}
		}
	}
	
	public void update()
	{
		if (this.a==null) {
			System.out.println("you have to create account");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter your account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter account password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				System.out.println("eneter your choice \n1.To update Contact Number \n2.To update City");
				int choice=sc.nextInt();
				if (choice==1) {
					System.out.println("Enter your new contact Number");
					long ncontactNumber=sc.nextLong();
					a.setContactNumber(ncontactNumber);
				}
				else if (choice == 2) {
					System.out.println("enter your new city");
					String ncity=sc.next();
					a.setCity(ncity);
					System.out.println("City name Updated Successfully");
				}
				else {
					System.out.println("Invalid choice");
				}
			}
			else {
				System.out.println("Incorrect Account Number or Incorrect Account Password");
			}
		}
	}
	
	public void deposit()
	{
		if (this.a==null) {
			System.out.println("You have to create");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter account password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				System.out.println("Please enter deposit amount");
				int depositBalance=sc.nextInt();
				int oldBalance=a.getBalance();
				int addBalance=depositBalance+oldBalance;
				a.setBalance(addBalance);
				System.out.println("deposit amount successfully");
			}
			else {
				System.out.println("Incorrect Account Number or Incorrect Account Password");
			}
		}
	}
	
	public void withDraw()
	{
		if (this.a==null) {
			System.out.println("You have to create account");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter account password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				System.out.println("enter withdraw amount");
				int withDrawBalance=sc.nextInt();
					if (withDrawBalance<=a.getBalance()) {
						int oldBalance=a.getBalance();
						int nBalance=oldBalance-withDrawBalance;
						a.setBalance(nBalance);
						System.out.println("amount withdrawn successfully");
					}
					else {
						System.out.println("opps! insufficient Balance... please try agian after sometime");
					}
			}
			else {
				System.out.println("Incorrect Account Number or Account Password");
			}
		}
	}
	
	public void changePin()
	{
		if (this.a==null) {
			System.out.println("You to create account");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter account password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				System.out.println("Plase enter your new pin");
				int pswd2=sc.nextInt();
				a.setPin(pswd2);
			}
			else {
				System.out.println("Incorrect Account Number or Account Password");
			}
		}
	}
	
	public void balanceEnquiry()
	{
		if (this.a==null) {
			System.out.println("You to create account");
		}
		else {
			Scanner sc=new Scanner (System.in);
			System.out.println("enter account number");
			long naccountNumber=sc.nextLong();
			System.out.println("enter account password");
			int npswd=sc.nextInt();
			if (npswd==a.getPin() && naccountNumber==a.getAccountNumber()) {
				System.out.println("Your account balance:"+a.getBalance());
			}
			else {
				System.out.println("Incorrect Account Number or Account Password");
			}
		}
	}
	
	

}
