package Lecture26;

public class Recursion_2DCombination {

	public static void main(String[] args) {
	comb (3, 3, 0, 0, 2, "", new boolean [3][3]);
	}
	public static void comb (int nrow, int ncol, int r, int c, 
			int toselect, String path, boolean [] [] board) {
		if (toselect == 0) {
			System.out.println(path);
			return; 
		}
		if (c == ncol) {
			r++;
			c = 0;
		}
		if (r == nrow) {
			return; 
		}
		if (isSafe(r, c, board)) {
			board[r][c] = true; 
			comb(nrow, ncol, r, c + 1, toselect - 1, 
					path + "{" + r + "," + c + "}", board);
			board[r][c] = false; 
		}
		
		
		comb(nrow, ncol, r, c + 1, toselect, path, board);
	}
	public static boolean isSafe(int r, int c, boolean [][] board) {
		for (int row = r; row >= 0; row--) {
			if (board[row][c]) {
				return false; 
			}
			
		}
		for (int col = c; col >= 0; col--) {
			if (board[r][col]) {
				return false; 
			}
		}
			
			
		return true;
	}

}
