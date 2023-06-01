package star;

public class LeftRightAngle {

	public static void main(String args[])
	{
		for (int i=0;i<=5 ;i++ )//outer looop for row
		{
			for (int j=2*(5-i);j>=0 ; j--)//inner loop for space
			{
				System.out.print(" ");//print space between teo star
			}
			for (int j=0;j<=i ;j++)//inner loop for column
			{
				System.out.print("* ");//print star
			}
			System.out.println();// curser to next line
		}
	}
}
