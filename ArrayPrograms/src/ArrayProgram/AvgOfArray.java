package ArrayProgram;

public class AvgOfArray {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		 * int arr[];
		 * System.out.println("Enter size of an array");
		 * int size=sc.nextInt();
		 * arr=new int[size];
		 */
		int arr[]= {1,10,20,5,4};
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		float avg=sum/arr.length;
		System.out.println("Average of array is : "+avg);
	}
	
}
