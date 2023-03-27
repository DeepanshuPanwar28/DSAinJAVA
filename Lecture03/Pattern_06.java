package Lecture03;

public class Pattern_06 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n; 
		int nsp = 0; 
		while (row <= n) {
			int cst = 0;
			int csp = 0; 
			while (csp < nsp) {
				System.out.print("  ");
				csp++; 
			}
			while (cst < nst) {
				System.out.print("* ");
				cst++; 
			}
			
			
			System.out.println();
			row++; 
			nst--;
			nsp = nsp + 2; 
		}
	}

}
