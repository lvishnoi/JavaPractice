import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/minimum-platforms/0

public class MinimumPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int firstArraySize;
		int secondArraySize;
		int[] firstArray;
		int[] secondArray;
		int[][] tmp = null;
		int[] result = null;
		int counter;
		int flag = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo];

		for (int k = 0; k < testCasesNo; k++) {
			firstArraySize = sc.nextInt();
			secondArraySize = firstArraySize;
			firstArray = new int[firstArraySize];
			secondArray = new int[secondArraySize];

			for (int i = 0; i < firstArraySize; i++) {
				firstArray[i] = sc.nextInt();
			}
			for (int i = 0; i < secondArraySize; i++) {
				secondArray[i] = sc.nextInt();
			}

			tmp = new int[2][firstArraySize];
			tmp[0][0] = firstArray[0];
			tmp[1][0] = secondArray[0];
			counter = 1;

			for (int p = 1; p < firstArraySize; p++) {
				for (int q = 0; q < p; q++) {
					if (tmp[0][q] == 0)
						break;
					if (firstArray[p] > tmp[0][q] & firstArray[p] > tmp[1][q]) {
						tmp[0][q] = firstArray[p];
						tmp[1][q] = secondArray[p];
						flag = 0;
						break;
					} else {
						flag = 1;
					}
				}
				if (flag != 0) {
					tmp[0][counter] = firstArray[p];
					tmp[1][counter++] = secondArray[p];
				}
			}
			result[k] = counter;
		}

		for (int k = 0; k < testCasesNo; k++)
			System.out.println(result[k]);

		sc.close();
	}
}
