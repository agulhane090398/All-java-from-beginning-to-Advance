package onlineCodeSolution;

import java.util.Scanner;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int noOfEle;
		while (true) {
			noOfEle = sc.nextInt();
			if (noOfEle <= 1000 && noOfEle > 0) {
				break;
			}
		}

		int A[] = new int[noOfEle];
		int B[] = new int[noOfEle];

		for (int i = 1; i <= A.length; i++) {
			while (true) {
				A[i - 1] = sc.nextInt();
				if (A[i - 1] < 10000 && A[i - 1] > 0) {
					break;
				}
			}

		}

		for (int i = 0; i < noOfEle; i++) {
			B[i] = A[noOfEle - i - 1];
		}

		for (int i = 0; i < noOfEle; i++) {
			System.out.print(B[i] + " ");
		}

	}

}
