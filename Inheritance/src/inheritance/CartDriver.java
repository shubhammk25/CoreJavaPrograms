package inheritance;

import java.util.Scanner;

public class CartDriver {
	
	public static void main(String[] args) {
		Cart c1=new Cart();
		boolean exit=true;
		Scanner sc=new Scanner (System.in);
		
		while(exit)
		{
			System.out.println("please enter your choice: \n1.To add book \n2.To remove book \n3.To check cart \n4.To show cart \n5.To exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.println("please enter your choice: \n1.Ramayana \n2.BhagwatGeeta");
					int a=sc.nextInt();
					switch(a)
					{
						case 1:
						{
							c1.addBook(a);
						}
						break;
						case 2:
						{
							c1.addBook(a);
						}
						break;
						default:
						{
							System.out.println("Invalid choice");
						}
					}
				}
				break;
				case 2:
				{
					c1.removeBook();
				}
				break;
				case 3:
				{
					c1.checkCart();
				}
				break;
				case 4:
				{
					c1.showCart();
				}
				break;
				case 5:
				{
					exit=false;
				}
				default:
				{
					System.out.println("Invalid choice");
				}
				
			}
		}
	}
}
