package HashsetEmp;

import java.util.Scanner;

public class CompanyDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Company c1=new Company();
		boolean exit=true;
		while(exit)
		{
			System.out.println("***Welcome to Company***\n Enter your choice \n1.To add Employee"
					+ "\n2.To remove Employee \n3.To update Department \n4.To update Password"
					+ "\n5.To display Details \n6.To Exit from current interface");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:{c1.addEmp();}			break;
			case 2:{c1.removeEmp();}		break;
			case 3:{c1.updateDept();}		break;
			case 4:{c1.updatePassword();}	break;
			case 5:{c1.displayDetails();}	break;
			case 6:{exit=false;}
			default:
				System.out.println("...Invalid Choice...");
											break;
			}
		}
		
	}
	
}
