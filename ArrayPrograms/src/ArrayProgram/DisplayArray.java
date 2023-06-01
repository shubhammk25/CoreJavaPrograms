package ArrayProgram;

import java.util.Scanner;

public class DisplayArray {

	/*
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=null;//declare array
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();//taking input from user
		arr=new int[size];//asssign length to array
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)//taking array elements from userss
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("...............");
		System.out.println("Entered array elements are.");
		for(int i=0;i<arr.length;i++)//display array elements
		{
			System.out.println(i+"index of array element is :" +arr[i]);
		}
	}*/
	
	
	public static void main(String[] args) {
		//declare and initilize an array
		int ar[][]= {{50,60},{70,80},{10,20},{90,100}};
		
		
		//Displaying twoD arary by using for Each loops
		for(int []i:ar) {
			for(int j:i) {
				System.out.println(j+" ");
			}
		}
		
		
		//Displaying twoD arary by using for loops
		 for(int i=0;i<ar.length;i++){
		 	for(int j=0;j<ar[i].length;j++){
		 		System.out.println(ar[i][j]+" ");
		 	}
		 }
	}
}

/*ways to declare an array
 * 1) int arr[]={10,20,30,04,50,56}; 
 * 		//display using array Arrays.toString()
 * 			sys(Arrays.toString(arr));
 * 		//declare and initilize an array
	sint ar[][]= {{50,60},{70,80},{10,20},{90,100}};
 *
 * 
 * 
 * 
 */
 /* 2) ways Displaying twoD arary by using for Each loops
  * 		int ar[][]= {{50,60},{70,80},{10,20},{90,100}};
		display using 2darray Arrays.deepToString()
			sys(Arrays.deepToString(ar));
  * 
  * 
  */
 