package core_java.assignmentSoln;

public class SelfNamePattern {
	public static void main(String[] args) {
		int n = 12;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if ((j == 0 && i != 0) || (i == 0 && j > 0 && j < (3 * n) / 4) || (j == (3 * n) / 4 && i > 0)
						|| (i == (n - 1) / 2 && j < (3 * n) / 4)) // A
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i + j == n / 2) || (i - j == n / 2)) // K
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {
				if ((j == 0) || (j == (3 * n) / 4) || (i == (n - 1) / 2) && j < (3 * n) / 4) // H
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < (3 * n) / 4 || i == n - 1 && j < (3 * n) / 4 || j == (n - 1) / 3)) // I
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i == n - 1) && j < (3 * n) / 4) // L
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i + j == n / 2) || (i - j == n / 2)) // K
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {
				if (j == 0 && i != n - 1 || (i == n - 1) && j > 0 && j < (n * 3) / 4
						|| (j == (n * 3) / 4) && i != n - 1) // U
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j && i < n/ 2 && j < n/ 2 || 
						j == n-1||i + j == n - 1 && i < n/ 2 && j > n/ 2) // M
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {

				if ((j == 0 && i != 0) || (i == 0 && j > 0 && j < (3 * n) / 4) || (j == (3 * n) / 4 && i > 0)
						|| (i == (n - 1) / 2 && j < (3 * n) / 4)) // A
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			for (int j = 0; j < n; j++) {

				if (j==0 && i!=0 ||i==0 && j>0 && j<(n*3)/4 || j==(n*3)/4 && i<(n-1)/2 ||i==(n-1)/2 && j<(3*n)/4||i-j==(n-1)/2) // R
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			
			
			System.out.println();

		}

	}

}
