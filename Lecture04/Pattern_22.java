package Lecture04;

public class Pattern_22 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		int nst2 = n;
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
			while (cst2 < nst2) {
				if (cst2 != n - 1) {
					System.out.print("* ");
				}
				
				cst2++;
			}
			System.out.println();
			row++;
			nst--;
			nst2--;
				nsp = nsp + 2; 
			
			
		}
	}

}
