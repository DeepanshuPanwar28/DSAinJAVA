package Lecture03;

public class Pattern_01 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int cst = 0; 
			int nst = n; 
			while (nst> cst) {
				System.out.print("*");
				cst++; 
			}
			System.out.println();
			row++;
		}
	}

}
