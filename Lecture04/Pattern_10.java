package Lecture04;

public class Pattern_10 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n * 2 - 1; 
		int nsp = 0; 
		while (row <= n) {
			
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++; 
			}
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				cst++; 
			}
			
			
			System.out.println();
			row++; 
			nsp++; 
			nst = nst - 2; 
		}
	}

}
