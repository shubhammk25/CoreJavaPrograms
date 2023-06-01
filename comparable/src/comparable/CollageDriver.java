package comparable;
import java.util.Arrays;

import java.util.Scanner;

public class CollageDriver {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of an anrray");
		int size=sc.nextInt();
		 Collage [] c1=new Collage[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter collage Name");
			String collageName=sc.next();
			System.out.println("Enter collage Id");
			int collageId=sc.nextInt();
			c1[i] =new Collage (collageName,collageId);
		}
		System.out.println("-------------------");
		for(int i=0;i<size;i++)
		{
			System.out.println(c1[i]);
		}
		System.out.println("-------------------");
		Arrays.sort(c1);
		for(int i=0;i<size;i++)
		{
			System.out.println(c1[i]);
		}
		
		System.out.println("Enter the collage name to search");
		String n=sc.next();
		
		for(int i=0;i<size;i++)
		{
			if(c1[i].collageName.equalsIgnoreCase(n)) {
				System.out.println("Collage name Found");
				return;
			}		
		}
		System.out.println("oops!..Collage not Found");
		
	}

}
