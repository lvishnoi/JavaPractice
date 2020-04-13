import java.util.Arrays;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray = 0;
		int[] arrayElement = null;
		int[][] result;
		int counterZero = 0;
		int counterOne = 0;
		int counterTwo = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo][1];

		for (int k = 0; k < testCasesNo; k++) {
			sizeOfArray = sc.nextInt();
			arrayElement = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arrayElement[i] = sc.nextInt();
			}

			for (int j = 0; j < sizeOfArray; j++) {
				if (arrayElement[j] == 0)
					counterZero++;
				else if (arrayElement[j] == 1)
					counterOne++;
				else
					counterTwo++;
			}
			for (int j = 0; j < sizeOfArray; j++) {
				if (counterZero > 0) {
					arrayElement[j] = 0;
					counterZero--;
					continue;
				}
				if (counterOne > 0) {
					arrayElement[j] = 1;
					counterOne--;
					continue;
				}
				if (counterTwo > 0) {
					arrayElement[j] = 2;
					counterTwo--;
					continue;
				}
			}
			result[k] = arrayElement;
		}

		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(Arrays.toString(result[k]) + " ");
		}
		sc.close();
	}
}