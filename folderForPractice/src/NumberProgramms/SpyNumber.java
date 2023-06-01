package NumberProgramms;

public class SpyNumber {
	
	public static void main(String[] args) {
		int n=1124,multi=1,sum=0,LastDigit;
		while(n>0) {
			LastDigit=n%10;
			sum=sum+LastDigit;
			multi=multi*LastDigit;
			n=n/10;
		}
		if(sum==multi) {
			System.out.println("The number is spy numner");
		}else {
			System.out.println("The number is not spy number");
		}
	}

}
