package Lecture12;

public class Mat_Demo {

	public static void main(String[] args) {
		int [][] mat = new int [5][0]; 
		System.out.println(mat[0]);
		mat[0] = null; 
		System.out.println(mat[0]);
		for (int [] row : mat) {
			System.out.println(row);
		}
		mat[0] = new int [1]; 
		mat[1] = new int [2]; 
		mat[2] = new int [3]; 
		mat[3] = new int [4]; 
		mat[4] = new int [5]; 
		for (int [] row : mat) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}
	}

}
