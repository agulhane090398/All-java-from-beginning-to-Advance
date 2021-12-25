package onlineCodeSolution;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 6;
		int col = 6;
		// int[][] a = new int[row][col];
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				while (true) {
//					a[i][j] = sc.nextInt();
//					if (a[i][j] <= 9 && a[i][j] >= -9) {
//						break;
//					}
//				}
//			}
//		}

		int a[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int[][] B = new int[row - 2][col - 2];
		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				B[i][j] = (a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2]);
			}

		}

		int max = B[0][0];
		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				if (max < B[i][j]) {
					max = B[i][j];
				}
			}

		}

		System.out.println(max);

		for (int i = 0; i < row - 2; i++) {
			for (int j = 0; j < col - 2; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
	}

}
