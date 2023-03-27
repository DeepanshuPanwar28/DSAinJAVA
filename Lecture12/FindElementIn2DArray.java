package Lecture12;

public class FindElementIn2DArray {

	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 }, 
				{ 21, 22, 23, 24 }, 
				{ 31, 32, 33, 34 }, 
				{ 41, 42, 43, 44 } };
		System.out.println(find(mat, 44)); 

	}
	public static boolean find (int [][] mat, int ele) {
	int r = 0; 
	int c = mat[0].length - 1;
	while (c >= 0 && r < mat.length) {
		if (mat[r][c] == ele) {
			return true; 
		} else if (mat[r][c]> ele) {
			c--; 
		} else {
			r++; 
		}
	}
	return false;
	}

}
