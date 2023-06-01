package stringAndStringBuffer;

public class ArraySort {
	public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		//sort array
		int arr[]= {7,1,8,2,3};
		//bubble sort
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				//condition
				if (arr[j]>arr[j+1]) {
					//swap
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		printArray(arr);
	}

}
