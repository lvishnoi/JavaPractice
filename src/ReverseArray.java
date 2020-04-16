import java.util.Arrays;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups/0

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray = 0;
		int group;
		int[] arrayElement = null;
		int[][] result;
		int tmp;
		int loopVar;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo][1];

		for (int k = 0; k < testCasesNo; k++) {
			sizeOfArray = sc.nextInt();
			group = sc.nextInt();
			arrayElement = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arrayElement[i] = sc.nextInt();
			}

			for (int j = 0; j < sizeOfArray; j = j + group) {
				loopVar = j + group;

				if (loopVar > sizeOfArray) {
					loopVar = sizeOfArray;
					for (int i = j; i < loopVar; i++) {
						tmp = arrayElement[i];
						arrayElement[i] = arrayElement[loopVar - 1];
						arrayElement[loopVar - 1] = tmp;
					}
				} else {
					loopVar--;
					for (int i = j; i < loopVar; i++, loopVar--) {

						tmp = arrayElement[i];
						arrayElement[i] = arrayElement[loopVar];
						arrayElement[loopVar] = tmp;
					}
				}
			}
			result[k] = arrayElement;
		}
		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(Arrays.toString(result[k]) + " ");
		}
		System.out.println();
		sc.close();
	}

}