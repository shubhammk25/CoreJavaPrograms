package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class school {

	student s;
	ArrayList<student> a1=new ArrayList();
	
	public void takeAdmission()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student name");
		String Student_name=sc.next();
		System.out.println("Enter student id");
		int id=sc.nextInt();
		System.out.println("Enter student standard");
		int std=sc.nextInt();
		
		s=new student(Student_name,id,std);
		a1.add(s);
		System.out.println("Admission taken successfully.........");
		
	}
	
	public void cancleAdmission()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id to cancle the admission");
		int sid=sc.nextInt();
		
		for(student s : a1)
		{
			if(sid==s.getId())
			{
				a1.remove(s);
				System.out.println("Admission cancled successfully...........");
				return;
			}
		}
		System.out.println("Id does not exist");
	}
	
	public void updateStandard()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id to update stdandard");int sid=sc.nextInt();
		for(student s : a1)
		{
			if(sid==s.getId())
			{
				System.out.println("Enter standard to update");
				int std=sc.nextInt();
				s.setStd(std);
				System.out.println("standard updated successfully........");
				return ;
			}
		}
		System.out.println("Id does not exist");
	}
	
	public void displayDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id to display details.");int sid=sc.nextInt();
		for (student s : a1) {
			if(sid==s.getId())
			{
				System.out.println(s);
				return;
			}
		}
		System.out.println("Id does not exist");
	}
}
