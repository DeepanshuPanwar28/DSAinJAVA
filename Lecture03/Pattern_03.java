package Lecture03;

public class Pattern_03 {

	public static void main(String[] args) {
		int n = 5; 
		int nst = n;
		int row = 1;
		while (row <= n) {
			int cst = 0; 
			while (cst < nst) {
				System.out.print("* ");
				cst++; 
			}
			System.out.println();
			row++; 
			nst--; 
		}
	}

}
