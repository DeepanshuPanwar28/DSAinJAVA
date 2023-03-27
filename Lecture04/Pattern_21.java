package Lecture04;

public class Pattern_21 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nst2 = 1;
		int nsp = 2 * n - 3;
		while (row <= n) {
			int cst = 0;
			while (cst < nst) {
				if (cst != n - 1) {
					System.out.print("* ");
				}
				cst++;
			}
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++; 
			}
			int cst2 = 0;
			while (cst2 < nst2) {
				System.out.print("* ");
				cst2++; 
			}
			System.out.println();
			row++; 
			nst++;
			nst2++; 
			nsp = nsp - 2; 
		}
	}

}
