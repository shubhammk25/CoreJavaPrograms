package NumberProgramms;

import java.util.Scanner;

public class SimpleInterest {

	int p,t;
	float si,r;
	public SimpleInterest() {
		p=0;
		r=0;
	}
	
	public void getData()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Principle :");
		p=sc.nextInt();
		System.out.println("Enter rate :");
		r=sc.nextFloat();
		System.out.println("Enter Time Period :");
		t=sc.nextInt();
		
	}
	
	public void calulation()
	{
		si=(p*r*t)/100;
	}
	
	public void display()
	{
		System.out.println("Principle : Rs" + p);
		System.out.println("Rate :"+r);
		System.out.println("Time Period:"+t);
		System.out.println("Simple Interest is :"+si);
	}
	
	public static void main(String[] args) {
		SimpleInterest s=new SimpleInterest();
		s.getData();
		s.calulation();
		s.display();
	}
	
	
}
