package Lecture04;

public class Pattern_33 {

	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int nsp = n - 1;
		int nst = 1; 
		int digit = n;
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++;
			}
			int ntp = digit; 
			int cst = 0;
			while (cst < nst) {
				if (nst - cst == row) {
					System.out.print(0 + "\t");
				} else {
					System.out.print(ntp + "\t");
				}
				if (cst < nst/2) {
					ntp++; 
				} else {
					ntp--; 
				}
				cst++; 
			}
			System.out.println();
			row++; 
			nsp--;
			nst = nst + 2;
			digit--; 
		}
	}

}
