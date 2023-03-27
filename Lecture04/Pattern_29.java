package Lecture04;

public class Pattern_29 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int digit = 1; 
		int nst = 1;
		int nsp = n - 1; 
		while (row <= n ) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++; 
			}
			int cst = 0;
			while (cst < nst) {
				if (cst == 0 || nst - cst == 1) {
					System.out.print(digit + "\t");
				} else {
					System.out.print(0 + "\t");
				}
				cst++; 
				if (cst <= nst/2) {
					digit++; 
				} else {
					digit--; 
				}
				
			}
			
			System.out.println();
			row++; 
			nst = nst + 2;
			nsp--; 
			digit = digit + 2; 
		}
	}

}
