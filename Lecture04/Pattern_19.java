package Lecture04;

public class Pattern_19 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nst = n / 2 + 1;
		int nst2 = n / 2;
		int nsp = -1;
		while (row <= n) {
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++;
			}
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2 = 0;
			if (row == 1 || row == n) {
				cst2 = 1; 
			}
				while (cst2 <= nst2) {
					System.out.print("* ");
					cst2++;
				}

		
			System.out.println();
			row++;

			if (row <= n / 2 + 1) {
				nst--;
				nst2--;
				nsp = nsp + 2;

			} else {
				nst++;
				nst2++;
				nsp = nsp - 2;
			}
			
		}
	}
}
