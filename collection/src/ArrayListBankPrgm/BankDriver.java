package ArrayListBankPrgm;

import java.util.Scanner;

public class BankDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Bank b1=new Bank();
		boolean exit=true;
		while(exit)
		{
			System.out.println("***Welcome to Bank Of India***\n Enter your choice \n1.To Create Account \n2.To delete Account"
					+ "\n3.To Display Your Details \n4.To update Conatact Number \n5.To update Password \n6.To Withdraw Amount"
					+"\n7.To Deposit Amount \n8.To check Balance \n9.Exit from current Interface");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:{b1.createAccount();}		break;
			case 2:{b1.deleteAccount();}		break;
			case 3:{b1.displayUser();}			break;
			case 4:{b1.updateContactNumber();}	break;
			case 5:{b1.updateUserPassword();}	break;
			case 6:{b1.withDraw();}				break;
			case 7:{b1.deposit();}				break;
			case 8:{b1.checkBalance();}			break;
			case 9:{exit=false;
					System.out.println("Application closed");}				break;
			default:
					System.out.println("opps!! Invalid Choice..Try again");
			
			}
		}
	}
	
}
