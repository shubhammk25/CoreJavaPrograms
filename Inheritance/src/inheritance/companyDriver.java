package inheritance;

import java.util.Scanner;

public class companyDriver {
	
	Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		company c=new company();
		boolean exit=true;
		while(exit) {
			System.out.println("....welcome to Company....");
			System.out.println("Enter your choice:\n 1.GenrateEmployee \n2.DeleteEmployee \n3.GetDetails \n4.exit from current interface");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter your Comapny Name");
				String cname=sc.next();
				System.out.println("Enter your name");
				String name=sc.next();
				System.out.println("Enter your Conatact Number");
				int cno=sc.nextInt();
				System.out.println("Enter your Id");
				int id=sc.nextInt();
				
				c.createEmployee(new employee(cname,id,name,cno));
			}break;
			case 2:{
				c.deleteEmployee();
			}break;
			case 3:{
				c.printDetails();
			}break;
			case 4:{
				exit=false;
				System.out.println("Application closed");
			}
			default:
			{
				System.out.println("Incorrect choice");
			}
			
			}
		}
	}

}
