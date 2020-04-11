import java.util.Scanner;

public class SubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int sumOfArray;
		int[] arrayElement;
		int[][] result;
		int arraySum;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the test cases no: ");
		testCasesNo = sc.nextInt();
		// System.out.println();
		result = new int[testCasesNo][2];
		// testCasesNo = testCasesNo * 2;

		for (int k = 0; k < testCasesNo; k++) {
			sizeOfArray = sc.nextInt();
			sumOfArray = sc.nextInt();
			arrayElement = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arrayElement[i] = sc.nextInt();
			}
			for (int i = 0; i < sizeOfArray; i++) {
				arraySum = arrayElement[i];
				for (int j = i + 1; j < sizeOfArray; j++) {
					arraySum = arraySum + arrayElement[j];
					if (arraySum == sumOfArray) {
						result[k][0] = i + 1;
						result[k][1] = j + 1;
						break;
					}
					if (arraySum > sumOfArray)
						break;
				}
				if (result[k][0] != 0)
					break;
				else
					continue;
			}
			// testCasesNo--;
		}
		for (int k = 0; k < testCasesNo; k++) {
			System.out.println(result[k][0] + " " + result[k][1]);
		}
		sc.close();
	}

}
