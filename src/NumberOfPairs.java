import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/number-of-pairs/0/

public class NumberOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int firstArraySize;
		int secondArraySize;
		int[] firstArray;
		int[] secondArray;
		int[] result = null;
		int counter = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo];

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

			if (firstArraySize > secondArraySize) {
				for (int i = 0; i < firstArraySize; i++) {
					for (int j = 0; j < secondArraySize; j++) {
						if (Math.pow(firstArray[i], secondArray[j]) > Math.pow(secondArray[j], firstArray[i]))
							counter++;
						else
							continue;
					}
				}
			} else {
				for (int i = 0; i < secondArraySize; i++) {
					for (int j = 0; j < firstArraySize; j++) {
						if (Math.pow(firstArray[j], secondArray[i]) > Math.pow(secondArray[i], firstArray[j]))
							counter++;
						else
							continue;
					}
				}
			}
			result[k] = counter;
		}
		
		for (int k = 0; k < testCasesNo; k++)
			System.out.println(result[k]);
		sc.close();
	}
}
