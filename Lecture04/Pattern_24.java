package Lecture04;

public class Pattern_24 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int digit = 1;
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++; 
			}
			int cst = 0; 
			while (cst < nst) {
				System.out.print(digit+ " ");
				cst++; 
			}
			System.out.println();
			row++; 
			nst = nst + 2;
			nsp--; 
			digit++; 
			
		}
	}

}
