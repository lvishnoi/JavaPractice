import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray = 0;
		int[] arrayElement;
		int[][] result = null;
		int counter;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo][50];

		for (int i = 0; i < testCasesNo; i++) {
			sizeOfArray = sc.nextInt();
			arrayElement = new int[sizeOfArray];
			for (int j = 0; j < sizeOfArray; j++) {
				arrayElement[j] = sc.nextInt();
			}
			counter = 0;
			for (int j = 0; j < sizeOfArray / 2; j++) {
				result[i][counter++] = arrayElement[sizeOfArray - 1 - j];
				result[i][counter++] = arrayElement[j];
			}
		}
		for (int k = 0; k < testCasesNo; k++) {
			for (int n = 0; n < 50; n++) {
				System.out.print(result[k][n] + " ");
				if (result[k][n + 1] == 0)
					break;
			}
			System.out.println();
		}
		sc.close();
	}
}