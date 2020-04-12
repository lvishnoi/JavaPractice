import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0

public class KadaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int[] arrayElement;
		int[] result;
		int maxCurrent;
		int maxGlobal;

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
			maxCurrent = maxGlobal = arrayElement[0];
			for (int j = 1; j < sizeOfArray; j++) {
				maxCurrent = Math.max(arrayElement[j], arrayElement[j] + maxCurrent);
				if (maxCurrent > maxGlobal)
					maxGlobal = maxCurrent;
			}
			result[k] = maxGlobal;
		}
		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(result[k]);
		}

		sc.close();
	}

}