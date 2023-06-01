package whatsapp;

import java.util.Scanner;

public class whatsappDriverr {
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			whatsapp w1=new whatsapp();
			boolean exit=true;
			while(exit)
			{
				System.out.println("enter your choice \n1.createAccount \n2.logout \n3.displayDetails \n4.updateStatus \n5.changePassword \n6.exit");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
					{
						if(w1.u==null) {
						System.out.println("enter user name");
						String username=sc.next();
						System.out.println("enter contact number");
						long contactNumber=sc.nextLong();
						System.out.println("enter your status");
						String status=sc.next();
						System.out.println("enter your password");
						int pswd=sc.nextInt();
						w1.createAccount(new user(username,status,contactNumber,pswd));
						//w1.createAccount();
						}
						else {
							System.out.println("Already you have login");
						}
					}
					break;
					case 2:
					{
						w1.logout();
						
					}
					break;
					case 3:
					{
						w1.displayDetails();
					}
					break;
					case 4:
					{
						w1.updateStatus();
					}
					break;
					case 5:
					{
						w1.changePassword();
					}
					break;
					case 6:
					{
						exit=false;
						System.out.println("application closed");
					}
					default:
					{
						System.out.println("Invalid choice");
					}
				}
			}
			
			
		}

}
