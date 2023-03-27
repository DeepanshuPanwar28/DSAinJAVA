package Lecture25;

public class Recursion_MazePath {

	public static void main(String[] args) {
		maze(0, 0, 2, 2, ""); 
	}
	public static void maze(int r, int c, int destr, int destc, String path) {
		if (r > destr || c > destc) { // negative base case
			return; 
		}
		if (r == destr && c == destc) { // positive base case
			System.out.println(path);
			return; 
		}
		maze (r + 1, c, destr, destc, path + "D"); 
		maze (r , c + 1, destr, destc, path + "R");
	}

}
