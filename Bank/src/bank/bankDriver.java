package bank;

import java.util.Scanner;

public class bankDriver {
		public static void main(String[] args) {
			Bank b=new Bank("Bank of India");
			account a;
			Scanner sc=new Scanner (System.in);
			boolean exit=true;
			while(exit)
			{
				System.out.println("Please enter your choice \n1.Create Account \n2.Delete Account \n3.Display User \n4.Upate \n5.Deposit amount \n6.Withdraw Amount \n7.Balance Enquiry \n8.exit");
				int choice=sc.nextInt();
				switch(choice)
				{
					case 1:
					{
						System.out.println("Enter your Name :");
						String userName=sc.next();
						System.out.println("Eneter your Contact Number :");
						long contactNumber=sc.nextLong();
						System.out.println("Eneter your City Name :");
						String city=sc.next();
						System.out.println("Eneter your Account Number :");
						long accountNumber=sc.nextLong();
						System.out.println("Eneter your Bank IFSC code :");
						String ifsc=sc.next();
						System.out.println("Eneter your password :");
						int pin=sc.nextInt();
						System.out.println("Eneter your amount to add :");
						int balance=sc.nextInt();
						
						b.createAccount(new account(userName,city,ifsc,contactNumber,accountNumber,pin,balance));
					}
					break;
					case 2:
					{
						b.deleteAccount();
					}
					break;
					case 3:
					{
						b.displayUser();
					}
					break;
					case 4:
					{
						b.update();
					}
					break;
					case 5:
					{
						b.deposit();
					}
					break;
					case 6:
					{
						b.withDraw();
					}
					break;
					case 7:
					{
						b.balanceEnquiry();
					}
					break;
					case 8:
					{
						exit=false;
					}
					break;
					default:
					{
						System.out.println("invaild choice");
					}
				}
			}
		}
}
