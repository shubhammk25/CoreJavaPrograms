
//sort 1st half in ascending order & 2d half in descending order

package ArrayProgram;
import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter elements to array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);//sorts the array-->util.Arrays
		
		int a=n/2;
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=n;i>a;i--)
		{
			System.out.print(arr[i-1]+" ");
		}
		
	}
}
