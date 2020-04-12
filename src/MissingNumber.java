import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/missing-number-in-array/0

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int[] arrayElement;
		int[] result;
		int diff;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo];

		for (int k = 0; k < testCasesNo; k++) {
			sizeOfArray = sc.nextInt() - 1;
			arrayElement = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arrayElement[i] = sc.nextInt();
			}
			diff = (arrayElement[sizeOfArray - 1] - arrayElement[0]) / (sizeOfArray);
			for (int i = 1; i < sizeOfArray; i++) {
				if (arrayElement[i - 1] + diff == arrayElement[i])
					continue;
				else
					result[k] = arrayElement[i - 1] + diff;
			}
		}
		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(result[k]);
		}
		sc.close();
	}
}