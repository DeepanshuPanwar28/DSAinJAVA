package Lecture26;

public class Recursion_QueenCombination {

	public static void main(String[] args) {
		comb(4, 0, 2, ""); 
	}
	public static void comb (int ncol, int c, int toselect, String path) {
		if (toselect == 0) {
			System.out.println(path);
			return; 
		}
		if (c == ncol) {
			return; 
		}
		comb(ncol, c + 1, toselect - 1, path + "q" + c);
		comb(ncol, c + 1, toselect, path);
	}

}
