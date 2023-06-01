package star;

public class NewTest {

	public static void main(String[] args) {
		//int p=5;
		/*for(int i=1;i<5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<i;j++)
			{
				if( j==1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			for(int j=1;j<=i;j++)
			{
				if( j==i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=i;j<5;j++)
			{
				if( j==i){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			for(int j=i;j<=5;j++)
			{
				if( j==5){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}

		
	
		
	}
}
