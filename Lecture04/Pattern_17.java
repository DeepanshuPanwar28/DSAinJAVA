package Lecture04;

public class Pattern_17 {

	public static void main(String[] args) {
		int n = 7; 
		int row = 1;
		int nst1 = n/2;
		int nsp = 1; 
		int nst2 = n/2; 
		while (row <= n) {
			int cst1 = 0;
			while (cst1 < nst1) {
				System.out.print("* ");
				cst1++; 
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
			row++; 
			System.out.println();
			if (row <= n/2 + 1) {
				nsp = nsp + 2; 
				nst1--; 
				nst2--; 
			} else {
				nsp = nsp - 2; 
				nst1++;
				nst2++; 
			}
		}
	}

}
