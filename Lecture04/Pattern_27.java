package Lecture04;

public class Pattern_27 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1; 
//		System.out.println(3/2);
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("\t");
				csp++; 
			}
			int cst = 0;
			int digit = 1; 
			while (cst < nst) {
				System.out.print(digit + "\t");
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
		}
	}

}
