package HashsetEmp;

import java.util.HashSet;
import java.util.Scanner;

public class Company {

	Scanner sc=new Scanner(System.in);
	Employee e;
	HashSet h1= new HashSet<>();
	
	public void addEmp()
	{
		System.out.println("Enter Employee name: ");
		String name=sc.next();
		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Employee department:");
		String dept=sc.next();
		System.out.println("Enter Employee Password:");
		double pswd=sc.nextDouble();
		System.out.println("Enter Employee salary:");
		double sal=sc.nextDouble();
		//h1.add(e);
		e=new Employee(name,id,dept,pswd,sal);
		h1.add(e);
		System.out.println(".....Employee Added Successfully.....");	
	}
	
	public void removeEmp()
	{
		if(e==null)
		{
			System.out.println("You have to add employee first");
		}else {
			System.out.println("Enter your id.");
			int id=sc.nextInt();
			System.out.println("Enter your password.");
			double pswd=sc.nextDouble();
			if(id==e.getId() && pswd==e.getPswd()){
				this.e=null;
				System.out.println("...Employee removed successfully...");
				return;
			}else {
				System.out.println("Incorrect id or password. please try again.");
			}
		}
	}
	
	public void updateDept()
	{
		if(e==null)
		{
			System.out.println("You have to add employee first");
		}else {
			System.out.println("Enter your id.");
			int id=sc.nextInt();
			System.out.println("Enter your password.");
			double pswd=sc.nextDouble();
			if(id==e.getId() && pswd==e.getPswd()) {
				System.out.println("Enter your new department name.");
				String ndept=sc.next();
				e.setDept(ndept);
				System.out.println("...Department name updated Successfully...");
			}else {
				System.out.println("Incorrect id or password. please try again.");
			}	
		}
	}
	
	public void updatePassword()
	{
		if(e==null)
		{
			System.out.println("You have to add employee first");
		}else {
			System.out.println("Enter your id.");
			int id=sc.nextInt();
			System.out.println("Enter your old password.");
			double pswd=sc.nextDouble();
			if(id==e.getId() && pswd==e.getPswd()) {
				System.out.println("Enter your new password to update.");
				double npswd=sc.nextDouble();
				e.setPswd(npswd);
				System.out.println("...Password updated Successfully...");
			}else {
				System.out.println("Incorrect id or password. please try again.");
			}	
		}
	}
	
	public void displayDetails()
	{

		if(e==null)
		{
			System.out.println("You have to add employee first");
		}else {
			System.out.println("Enter your id.");
			int id=sc.nextInt();
			System.out.println("Enter your old password.");
			double pswd=sc.nextDouble();
			if(id==e.getId() && pswd==e.getPswd()) {
				System.out.println(e.getName());
				System.out.println(e.getDept());
				System.out.println(e.getId());
				System.out.println(e.getSal());
			}else {
				System.out.println("Incorrect id or password. please try again.");
			}	
		}
	}
	
	
	
}
