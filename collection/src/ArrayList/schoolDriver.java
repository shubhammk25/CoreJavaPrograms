package ArrayList;

import java.util.Scanner;

public class schoolDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		school s1= new school();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice..\n1.takeAddmission \n2.cancleAdmission \n3.updateStandard \n4.dispayDetails \n5.exit");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:{s1.takeAdmission();}break;
			case 2:{s1.cancleAdmission();}break;
			case 3:{s1.updateStandard();}break;
			case 4:{s1.displayDetails();}break;
			case 5:{exit=false;}break;
			default:{System.out.println("invalid choice..");}
				break;
			}
			
		}
	}
	
}
