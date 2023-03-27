package Lecture12;

public class SpiralAnticlockwiseDisplay {

	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		spiral(mat);
	}

	public static void spiral(int[][] mat) {
		int count = 0;
		int pdt = mat.length * mat[0].length; 
		int minr = 0;
		int minc = 0;
		int maxr = mat.length - 1;
		int maxc = mat[0].length - 1;
		while (minr <= maxr && minc <= maxc) {
			for (int r = minr; r <= maxr && count < pdt; r++) {
				System.out.print(mat[r][minc] + " ,");
				count++; 
			}
			System.out.println();

			for (int c = minc + 1; c <= maxc&& count < pdt; c++) {
				System.out.print(mat[maxr][c] + " ,");
				count++; 
			}
			System.out.println();
			for (int r = maxr - 1; r >= minr&& count < pdt; r--) {
				System.out.print(mat[r][maxc] + " ,");
				count++; 
			}
			System.out.println();
			for (int c = maxc - 1; c >= minc + 1&& count < pdt; c--) {
				System.out.print(mat[minr][c] + " ,");
				count++; 
			}
			System.out.println();
			
	minr++; 
	maxr--; 
	maxc--; 
	minc++; 
		}
		System.out.println("END");
		
	}

}
