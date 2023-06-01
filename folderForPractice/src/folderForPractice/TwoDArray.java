package folderForPractice;

public class TwoDArray {

	public static void main(String[] args) {
		//2d array
		int [] [] a= {{10,20,30},{20,30,30},{30,40,30},{40,50,30},{70,70,30}};
		//displaying size of array
		System.out.println("2d array size"+a.length);
		System.out.println("First row size = "+a[0].length);
		System.out.println("Second row size = "+a[1].length);
		//display array using length property
		System.out.println("Array elements :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
