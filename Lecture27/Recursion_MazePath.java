package Lecture27;

public class Recursion_MazePath {

	public static void main(String[] args) {
		int mazepath [][] = {{0, 1, 0, 0},
				 {0, 0, 0, 0},
				 {0, 1, 0, 0},
				 {0, 0, 1, 0}}; 
		maze(0,0, mazepath, "", new boolean[mazepath.length][mazepath[0].length]); 

	}
	public static void maze(int r, int c, int [][] mat, String path, boolean [][] Visited) {
		if (r == mat.length - 1 &&  c == mat[0].length - 1) {
			System.out.println(path);
			return; 
		}
		if (r < 0 || r == mat.length||c < 0 || c == mat[0].length||mat[r][c] == 1 || Visited[r][c] ){
			return; 
		}
		Visited[r][c] = true; 
			maze(r - 1, c, mat, path + "U", Visited);
		
		
			maze(r + 1, c, mat, path + "D",Visited);

		
		
			maze(r, c + 1, mat, path + "R",Visited);
		
		
			maze (r, c - 1, mat, path + "L",Visited); 

		Visited[r][c] = false; 
		
	}

}
