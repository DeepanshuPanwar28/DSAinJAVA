package Lecture12;


public class WaveDisplay_2DArray {

	public static void main(String[] args) {
		int[][] mat = {{11, 12, 13, 14}, 
					   {21,22, 23, 24},
				   	   {31, 32, 33, 34}, 
					   {41, 42, 43, 44}}; 
//		Display(mat); 
		Wave(mat); 
	}
	public static void Wave (int [][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			for (int r = 0; r < mat.length; r++) {
				int row = r; 
				if (c % 2 == 1) {
					row = mat.length - 1  - r; 
				}
				System.out.print(mat[row][c] +" "); 
			}
			System.out.println();
		}
	}

}
