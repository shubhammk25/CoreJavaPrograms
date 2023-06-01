package star;

public class HallowDiamond {
	public static void main(String[] args) {
	
		int k=5,r=1;
		for(int i=1;i<=9;i++)
		{
			for(int a=1;a<=k;a++)
			{
				System.out.print("* ");
			}
			for(int j=2;j<=r;j++) 
			{
				System.out.print("  ");
			}
			for(int b=1;b<=k;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i>4) {
				k++;
				r-=2;
			}else {
				
				k--;
				r+=2;
			}
		}
			
		}
		
	}

