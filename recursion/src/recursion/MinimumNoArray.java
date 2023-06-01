package recursion;

public class MinimumNoArray {
	
	public static void main(String[] args) {
		int arr[]= {1,12,5,26,9};
		int min=getmin(arr);
		System.out.println("min:"+min);
	}
	
	public static int getmin(int a[])
	{
		int min=a[0];
		for(int num:a)
		{
			if(num<min)
			{
				min=num;
			}
		}
		return min;
	}
}
