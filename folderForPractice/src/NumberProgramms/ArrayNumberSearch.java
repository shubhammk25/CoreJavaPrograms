package NumberProgramms;

import java.util.Scanner;

public class ArrayNumberSearch {

	public static void main(String[] args) {
		
				System.out.println("Enter Sixe of an array");
				Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				int arr[]= new int[size];
				
				for (int i=0;i<size ;i++ )
				{
					System.out.println("enter element of array for "  +  i  +  " index of array");
					 arr[i]=sc.nextInt();
					
				}
				
				System.out.println(".....................");
				for (int i=0;i<size ;i++ )
				{
					System.out.println(arr[i]);
				}
				
				System.out.println("enter the number which you want to search");
				int num=sc.nextInt();
				
				for (int i=0;i<size ;i++ )
				{
					if (num==arr[i])
					{
						System.out.println("found");
						break;
					}	
				}
				System.out.println("opps ! not found");
			}
	}

