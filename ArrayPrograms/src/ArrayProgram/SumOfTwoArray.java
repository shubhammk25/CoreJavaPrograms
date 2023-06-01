package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// taking both array size
		System.out.println("Enter size for Array 1");
		int arr1size = sc.nextInt();
		System.out.println("Enter size for Array 2");
		int arr2size = sc.nextInt();

		// both array have same size
		if (arr1size != arr2size) {
			System.out.println("opps!..sorry array must have same size");
			return;
		} else {

			// declaring three arrays with given size
			int[] arr1 = new int[arr1size];
			int[] arr2 = new int[arr1size];
			int[] arr3 = new int[arr1size];

			// take elements of array1 from user
			System.out.println("Enter Elements for Array 1");
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}

			// take elements of array2 from user
			System.out.println("Enter Elements for Array 2");
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}

			// add array1 and array2
			for (int i = 0; i < arr3.length; i++) {
				arr3[i] = arr1[i] + arr2[i];
			}

			System.out.println("Result as addition : " + Arrays.toString(arr3));

		}
	}

}
