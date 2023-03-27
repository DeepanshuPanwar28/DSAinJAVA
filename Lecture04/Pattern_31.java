package Lecture04;

public class Pattern_31 {

	public static void main(String[] args) {
		int n = 20; 
		int row = 1;
		int nst = n;
		int digit = n; 
		while (row <= n) {
			int cst = 0;
			while (cst < nst) {
				if (cst + row == n) {
					System.out.print("* ");
				} else {
					System.out.print(digit +" ");
				}
				cst++; 
				digit--; 
			}
			System.out.println();
			row++;
			digit = n; 
			
		}
	}

}
