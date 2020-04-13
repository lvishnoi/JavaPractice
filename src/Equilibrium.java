import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/equilibrium-point/0

public class Equilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int[] arrayElement;
		int[] result;
		int leftSum;
		int rightSum;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo];

		for (int k = 0; k < testCasesNo; k++) {
			sizeOfArray = sc.nextInt();
			arrayElement = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arrayElement[i] = sc.nextInt();
			}

			if (sizeOfArray == 1) {
				result[k] = 1;
				continue;
			}
			if (sizeOfArray == 2) {
				result[k] = 0;
				continue;
			}
			for (int j = 1; j < sizeOfArray - 1; j++) {
				leftSum = rightSum = 0;
				for (int l = 0; l < j; l++)
					leftSum = leftSum + arrayElement[l];
				for (int m = j + 1; m < sizeOfArray; m++)
					rightSum = rightSum + arrayElement[m];
				if (leftSum == rightSum)
					result[k] = j+1;
			}
		}

		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(result[k]);
		}
		sc.close();
	}
}