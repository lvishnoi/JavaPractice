import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/leaders-in-an-array/0

public class ArrayLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int[] arrayElement;
		int[][] result;
		int count;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter test cases: ");
		testCasesNo = sc.nextInt();
		result = new int[testCasesNo][10];

		for (int k = 0; k < testCasesNo; k++) {
			sizeOfArray = sc.nextInt();
			arrayElement = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arrayElement[i] = sc.nextInt();
			}

			count = 0;
			for (int i = 0; i < sizeOfArray-1; i++) {
				if(arrayElement[i] > arrayElement[i+1])
					result[k][count++] = arrayElement[i];
			}
			result[k][count++] = arrayElement[sizeOfArray-1];
			result[k][count++] = -1;
		}
		
		for (int k = 0; k < testCasesNo; k++) {
			for (int n = 0; n < 10; n++) {
				System.out.print(result[k][n] + " ");
				if (result[k][n + 1] == -1)
					break;
			}
			System.out.println();
		}
		sc.close();
	}
}