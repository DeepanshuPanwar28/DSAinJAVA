package Lecture04;

public class Pattern_14 {

	public static void main(String[] args) {
		int n = 5; 
		int row = 1;
		int nst = 1; 
		int nsp = n - 1;  
		while (row <= n * 2 - 1) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("   ");
				csp++; 
			}
			int cst = 0;
			while (cst < nst) {
				System.out.print("*  ");
				cst++; 
				 
			}
			System.out.println();
			row++;
			if (row <= n) {
				nst++; 
				nsp--;
			} else {
				nst--; 
				nsp++; 
			}
			
		}
	}

}
