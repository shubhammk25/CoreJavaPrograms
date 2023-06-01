package star;

public class hallowPatterns {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			char k='A';
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==7 ||j==7 ||j==4)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(k+" ");
					k++;
					
				}
			}
			System.out.println();
			
		}
	}
	
}
