package TP;

public class Pt {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {

			for (int j = i; j <= 5; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				
				System.out.print("* ");

			}
			for (int j = 1; j < i; j++) {
//				if(j==1 && j==i)
				System.out.print("* ");
			}
			System.out.println();

		}

	}	
}
