package inheritance;

import java.util.Scanner;

public class BagDriver {
	public static void main(String[] args) {
		
	Bag b1=new Bag();
	boolean exit=true;
	Scanner sc=new Scanner (System.in);
	while(exit)
	{
		System.out.println("Enter the choice: \n1.add ball \n2.remove ball \n3.check bag \n4.show game \n5.exit");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the choice: \n1.Basket ball \n2.Tennis ball");
				int a=sc.nextInt();
				switch(a)
				{
					case 1:
					{
						b1.addBall(a);
					}
					break;
					case 2:
					{
						b1.addBall(a);
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
				b1.removeBall();
			}
			break;
			case 3:
			{
				b1.checkBag();
			}
			break;
			case 4:
			{
				b1.showGame();
			}
			break;
			case 5:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid choice");
			}
		}
	}
}
}
