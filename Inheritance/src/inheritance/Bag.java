package inheritance;

import java.util.Scanner;

public class Bag {
	
	Ball b;
	
	public void addBall(int choice)
	{
		if (this.b==null) {
			Scanner sc=new Scanner (System.in);
			if (choice==1) {
				
				System.out.println("enter the radius of basket ball");
				double radius=sc.nextDouble();
				b=new BasketBall(radius);
				System.out.println("BasketBall added successfully into Bag");
			}
			else if (choice==2) {
				System.out.println("enter the radius of tennis ball");
				double radius=sc.nextDouble();
				b=new TennisBall(radius);
				System.out.println("TennisBall added successfully into Bag");
			}
			else {
				System.out.println("Invalid choice");
			}
		}
	}
	
	public void removeBall()
	{
		if (this.b==null) {
			System.out.println("first you have to add ball into Bag");
		}
		else {
			this.b=null;
			System.out.println("Ball removed successfully");
		}
	}
	
	public void checkBag()
	{
		if (this.b==null) {
			System.out.println("first you have to add ball into Bag");
		}
		
		else {
			System.out.println("Ball is present into a Bag");
		}
	}
	
	public void showGame()
	{
		if (this.b==null) {
			System.out.println("first you have to add ball into Bag");
		}
		else {
			if (this.b instanceof BasketBall) {
				BasketBall b1= (BasketBall) b;
				System.out.println("You can play: "+b1.getName());
				}
			else {
				TennisBall t1= (TennisBall) b;
				System.out.println("You can play: "+t1.getName());
			}
		}
	}

}
