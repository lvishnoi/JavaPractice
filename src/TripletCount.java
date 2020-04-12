import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/count-the-triplets/0

public class TripletCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCasesNo;
		int sizeOfArray;
		int[] arrayElement;
		int[] result;
		int arraySum;

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
			arraySum = 0;
			for (int i = 0; i < sizeOfArray; i++) {
				for (int j = 0; j < sizeOfArray; j++) {
					if (j == i)
						continue;
					for (int l = 0; l < sizeOfArray; l++) {
						if (l == j | l == i)
							continue;
						if (arrayElement[i] == arrayElement[j] + arrayElement[l]) {
							arraySum++;
							i++;
							j = 0;
							break;
						}
					}
				}
			}
			result[k] = arraySum;
		}
		for (int k = 0; k < testCasesNo; k++) {
			if (result[k] == 0)
				result[k] = -1;

			System.out.println(result[k]);
		}

		sc.close();
	}

}
