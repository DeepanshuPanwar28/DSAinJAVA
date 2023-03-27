package Lecture27;

public class Recursion_SudokuSolver {

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		sudoku(0, 0, board); 

	}
	public static void sudoku(int r, int c, char [][] board) {
		if (c == 9) {
			c = 0;
			r++; 
		}
		if (r == 9) {
			display(board); 
			return; 
		}
		if (board [r][c] != '.') {
			sudoku(r, c + 1, board);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(r, c, i, board)); 
				board[r][c] = (char)('0' + i); 
				sudoku(r, c + 1, board);
				
			}
			board[r][c] = '.'; 
		}
		
	}
	public static void display(char [][] mat) {
		for (char[] row : mat) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
	public static boolean isSafe(int r, int c, int i, char[][] board) {
		
		char ch = (char)('0' + i);
		for (int row = 0; row<9; row++) {
			if (board[row] [c] == ch) {
				return false; 
				
			}
		}
		for (int column = 0; column<9; column++) {
			
			if (board[r] [column] == ch) {
				return false; 
				
			}
		}
		int boxr = r / 3;
		int boxc = c/ 3; 
		for (int row = boxr * 3; row < boxr * 3 + 3; row++) {
			
			for (int column = boxc * 3; column < boxc * 3 + 3;column++) {
				
				
				if (board [row][column] == ch) {
					return false; 
				}
				
			}
		}
		return true;
		
		
	}
	
	
		

}
