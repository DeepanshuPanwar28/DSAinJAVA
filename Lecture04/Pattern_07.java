package Lecture04;

public class Pattern_07 {

	public static void main(String[] args) {
		int n = 5;
		int numst = n;
		int row = 1;
		while (row <= n) {
			int cst = 0;
			while (cst < numst) {
				if (row == 1 || row == n || cst == n - 1 || cst == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cst++;
			}
			System.out.println();
			row++;
		}
	}

}
