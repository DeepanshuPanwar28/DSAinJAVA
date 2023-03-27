package Lecture04;

public class Pattern_30 {

	public static void main(String[] args) {
		int n = 5; 
		int row = 1;
		int nst = n;
		int digit = n; 
		while (row <= n) {
			int cst = 0;
			while (cst < nst) {
				System.out.print(digit +" ");
				cst++; 
				digit--; 
			}
			System.out.println();
			row++;
			digit = n; 
			
		}
	}

}
