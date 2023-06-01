package swiggy;

import java.util.Scanner;

public class swiggyDriver {
	static String orderr;
	public static void main(String[] args) {
		swiggy s=new swiggy();
		Scanner sc=new Scanner (System.in);
		boolean exit=true;
		
		while(exit)
		{
			System.out.println("***Welcome to Swiggy***");
			System.out.println("1.place order \n2.display order \n3.update Details \n4.cancle order \n5.exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					if (s.c==null) {
						System.out.println("Enter Restraunt Name");
						String restrauntName=sc.next();
						s.restruantName=restrauntName;
						System.out.println("Enter user name ");
						String userName=sc.next();
						System.out.println("Enter contact Number");
						long contactNumber=sc.nextLong();
						System.out.println("Enter your area or home address");
						String area=sc.next();
						System.out.println("Enter your choice \n1.Biryani \n2.pav Bhaji \n3.ice cream \n4.Idli \n5.Dosa \n6.kathiyawadi thali \n7.Chicken Fired rice \n8.Dhokla \n9.fafda jalebi \n10.Chole Bhature");
						int orderNumber=sc.nextInt();
						if (orderNumber==1) {
							orderr="Briyani";
						}
						else if (orderNumber==2) {
							orderr="pav bhaji";
						}
						else if (orderNumber==3) {
							orderr="ice creame";
						}
						else if (orderNumber==4) {
							orderr="idli";
						}
						else if (orderNumber==5) {
							orderr="dosa";
						}
						else if (orderNumber==6) {
							orderr="kathiyawadi thali";
						}
						else if (orderNumber==7) {
							orderr="chicken fried rice";
						}
						else if (orderNumber==8) {
							orderr="Dhokla";
						}
						else if (orderNumber==9) {
							orderr="fafda jalebi";
						}
						else if (orderNumber==10) {
							orderr="chole bhature";
						}
						else {
							System.out.println("Invalid choice");
						}
						s.place_Order (new customer(userName,contactNumber,area,orderr,orderNumber));
						
					}
					else {
						System.out.println("order already placed");
					}
				}
				break;
				case 2:
				{
					s.displayOrder();
				}
				break;
				case 3:
				{
					s.updateDetails();
				}
				break;
				case 4:
				{
					s.cancleOrder();
				}
				break;
				case 5:
				{
					exit=false;
					System.out.println("Application closed");
				}
				break;
				default:
				{
					System.out.println("Invaild choice");
				}
					
			}
		}
	}

}
