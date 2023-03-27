package Lecture04;

public class Pattern_32 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1; 
		int nst = 1; 
		int digit = 1; 
		System.out.println(7/2);
		while (row <= n * 2 - 1) {
			int cst = 0;
			while (cst < nst) {
				if (cst % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print(digit + " ");
				}
				cst++; 
			}
			row++;
			System.out.println();
			if (row <= n * 2/2) {
				nst = nst + 2; 
				digit++; 
			} else {
				nst = nst - 2; 
				digit--; 
			}
		 
		}
	}

}
