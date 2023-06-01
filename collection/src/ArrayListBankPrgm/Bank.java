package ArrayListBankPrgm;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	Account a;
	ArrayList<Account> a1=new ArrayList();
	Scanner sc= new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("Enter Your User name:");
		String User_name=sc.next();
		System.out.println("Enter Your User Account Number:");
		long Account_number=sc.nextLong();
		System.out.println("Enter Your User Contact Number:");
		long Contact_number=sc.nextLong();
		System.out.println("Enter Your User balance:");
		int balance=sc.nextInt();
		System.out.println("Enter Your User city:");
		String city=sc.next();
		System.out.println("Enter Your User Password:");
		int pass=sc.nextInt();
		
		a=new Account(User_name,Account_number,Contact_number,balance,city,pass);
		a1.add(a);
		System.out.println("......Account created Successfully......");
		
	}
	
	public void deleteAccount()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}
		else {
		System.out.println("Enter Your User Password to delete User Account:");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				a1.remove(a);
				System.out.println("......Deleted User Account Successfully......");
				return;
			}
		}
		
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	public void displayUser()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}
		else {
		System.out.println("Enter Your User Password to Display User Account:");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				System.out.println(a);
				return;
			}	
		}
		
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	public void updateContactNumber()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}
		else {
		System.out.println("Enter Your User Password to update contact");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				System.out.println("Enter the New contact Number To update.");
			    long nContact_Number=sc.nextLong();
			    a.setContact_number(nContact_Number);
			    System.out.println("......Contact Number Updated Successfully......");
			    return;
			}
		}
		
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	public void updateUserPassword()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}
		else {
		System.out.println("Enter Your Old Password to update Password");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				System.out.println("Enter the New Password.");
			    int npd=sc.nextInt();
			    a.setPassword(npd);
			    System.out.println("......Password  Updated Successfully......");
			    return;
			}
		}
		
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	public void withDraw()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}
		else {
		System.out.println("Enter Your User Password to withdraw amount");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				System.out.println("Enter the Amount want to Withdraw");
				int wdbal=sc.nextInt();
				//a.setBalace(a.getBalace()-wdbal);
				if (wdbal>a.getBalace()) {
					System.out.println("...Insufficient Balance...! Try again after sometime");
					return;
				}
				else
				{
					a.setBalace(a.getBalace()-wdbal);
					System.out.println("...Amount Withdrawal Successfull...");
				}
			}
			return;
		}
		
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	public void deposit()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}else {
		System.out.println("Enter Your User Password to Deposit amount");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				System.out.println("Enter the Amount want to Deposit");
				int dpbal=sc.nextInt();
				a.setBalace(a.getBalace()+dpbal);
				System.out.println("...Amount Credited Successfull...");
				return;
			}
		}
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	public void checkBalance()
	{
		if (a==null) {
			System.out.println("......oops! (*~*) You Don't Your Account In B.O.I ......");
		}else {
		System.out.println("Enter Your User Password to check Balance:");
		int pass=sc.nextInt();
		for (Account account : a1) {
			if (pass==a.getPassword()) {
				System.out.println("Your Balace is: "+a.getBalace());
				return;
			}
		}
		
		System.out.println("User Password does not match! Try again.");
		}
	}
	
	
		
}

