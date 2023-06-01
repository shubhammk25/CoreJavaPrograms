package star;

import java.util.Iterator;

public class star {
	public static void main(String[] args) {
		
		
		/*for (int r=0;r<5 ;r++ )//outer loop for row
		{
			for (int c=5-r;c>1 ;c-- )//inner loop for space
			{
				System.out.print(" ");//print space
			}
			for (int c=0; c<=r;c++ )//inner loop for column
			{
				System.out.print("* ");//print star
			}
			System.out.println();// Courser to next line 
		}*/
		
		for(int i=1;i<5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
			
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		for(int i=2;i<5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
			
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	
}
