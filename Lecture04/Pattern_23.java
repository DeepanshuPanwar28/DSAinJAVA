package Lecture04;

public class Pattern_23 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1; 
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++; 
			}
			int cst = 0;
			while (cst < nst) {
				System.out.print("1 ");
				cst++; 
			}
			
			System.out.println();
			row++; 
			nst = nst + 2; 
			nsp--; 
		}
	}

}
