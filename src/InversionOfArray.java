import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/inversion-of-array/0/

public class InversionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int[] arrayElement;
		int[] result;
		int counter = 0;

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

			for (int j = 0; j < sizeOfArray; j++) {
				for (int i = j+1; i<sizeOfArray; i++) {
					if (arrayElement[j] > arrayElement[i]) {
						counter++;
					}
				}
			}
			result[k] = counter;
		}
		
		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(result[k]);
		}
		sc.close();
	}
}