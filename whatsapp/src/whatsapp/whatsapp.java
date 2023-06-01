package whatsapp;

import java.util.Scanner;

public class whatsapp {
	user u;
	public void createAccount(user u)
	{
		if (this.u==null) {
			this.u=u;
			System.out.println("account created successfully");
		}
	}
	
	public void logout()
	{
		Scanner sc=new Scanner (System.in);
		if (this.u==null) {
			System.out.println("You don't have account..create it first");
		}
		else {
			//Scanner sc =new Scanner(System.in);
			System.out.println("Please enter your password");
			int pswd=sc.nextInt();
			if (pswd==u.getPswd()) {
				this.u=null;
				System.out.println("logout successfully");
			}
			else {
				System.out.println("incorrect password");
			}
		}
	}
	
	public void displayDetails()
	{
		if (this.u==null) {
			System.out.println("you have to login first");
		}
		else {
			Scanner sc =new Scanner (System.in);
			System.out.println("Please enter your password");
			int pswd=sc.nextInt();
			if (pswd==u.getPswd()) {
				System.out.println("user name: "+u.getUserName());
				System.out.println("contact Number: "+u.getContactNumber());
				System.out.println("Status: "+u.getStatus());
			}
			else {
				System.out.println("Incorrect password");
			}
		}
	}
	
	public void updateStatus()
	{
		if (this.u==null) {
			System.out.println("you have to login first");
		}
		else {
			Scanner sc =new Scanner (System.in);
			System.out.println("Please enter your password");
			int pswd=sc.nextInt();
			if (pswd==u.getPswd()) {
				System.out.println("Please enter new Status to update");
				String status =sc.next();
				u.setStatus(status);
				System.out.println("Status updated successfully");
			}
			else {
				System.out.println("Incorrect password");
			}
		}
	}
	
	public void changePassword()
	{
		if (this.u==null) {
			System.out.println("you have to login first");
		}
		else {
			Scanner sc =new Scanner (System.in);
			System.out.println("Please enter your password");
			int pswd=sc.nextInt();
			if (pswd==u.getPswd()) {
				System.out.println("Please enter new password");
				int npswd=sc.nextInt();
				u.setPswd(npswd);
				System.out.println("Password updated successfully");
			}
			else {
				System.out.println("Incorrect password");
			}
		}
	}

}
