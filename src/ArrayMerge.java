import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int firstArraySize;
		int secondArraySize;
		int[] firstArray;
		int[] secondArray;
		int[][] result = null;
		int j, m = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo][50];

		for (int k = 0; k < testCasesNo; k++) {
			firstArraySize = sc.nextInt();
			secondArraySize = sc.nextInt();
			firstArray = new int[firstArraySize];
			secondArray = new int[secondArraySize];

			for (int i = 0; i < firstArraySize; i++) {
				firstArray[i] = sc.nextInt();
			}
			for (int i = 0; i < secondArraySize; i++) {
				secondArray[i] = sc.nextInt();
			}

			j = m = 0;

			if (firstArraySize > secondArraySize) {
				for (int i = 0; i < firstArraySize; i++) {
					for (; j < secondArraySize; j++) {
						if (secondArray[j] > firstArray[i]) {
							result[k][m++] = firstArray[i];
							break;
						}
						if (secondArray[j] < firstArray[i]) {
							result[k][m++] = secondArray[j];
							continue;
						}
					}
					if (j >= secondArraySize)
						result[k][m++] = firstArray[i];
				}
			} else {
				for (int i = 0; i < secondArraySize; i++) {
					for (; j < firstArraySize; j++) {
						if (firstArray[j] > secondArray[i]) {
							result[k][m++] = secondArray[i];
							break;
						}
						if (firstArray[j] < secondArray[i]) {
							result[k][m++] = firstArray[j];
							continue;
						}
					}
					if (j >= firstArraySize)
						result[k][m++] = secondArray[i];
				}
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
