package inheritance;

import java.util.Scanner;

public class company {
	
	employee e;
	Scanner sc=new Scanner(System.in);
	/*public company(employee e)
	{
		this.e=e;
	}*/
	
	public void createEmployee(employee e)
	{
		if (this.e==null)
		{
			this.e=e;
			System.out.println("emp created successfully..");
		}else {
			System.out.println("Already emp is present");
		}
	}
	
	public void deleteEmployee() {
		if(this.e==null) {
			System.out.println("Genrate emp 1st");
		}else {
			System.out.println("enter your id");
			int id=sc.nextInt();
			if(id==e.getId()) {
				this.e=null;
				System.out.println("emp deleted successfully");
			}else {
				System.out.println("incorrect id");
			}
		}
	}
	
	public void printDetails() {
		if(this.e==null) {
			System.out.println("generate emp 1st");
		}else {
			System.out.println("Enter your id");
			int id=sc.nextInt();
			System.out.println("Enetr your contact");
			int cno=sc.nextInt();
			if(id==e.getId() && cno==e.getCno()) {
				//this.e=e;
				System.out.println("company name: "+e.getCname());
				System.out.println("name: "+e.getName());
				System.out.println("id: "+e.getId());
				System.out.println("contact: "+e.getCno());
			}else {
				System.out.println("incorrect id or contact number");
			}
		}
		
	}
	

}
