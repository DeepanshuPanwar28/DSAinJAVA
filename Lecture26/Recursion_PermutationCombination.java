package Lecture26;

public class Recursion_PermutationCombination {

	public static void main(String[] args) {
		perm(4, 2, "", new boolean[4]); 
	}
	public static void perm(int numbox, int toselect, String path, boolean [] arr) {
		if (toselect == 0) {
			System.out.println(path);
			return; 
		}
		
		for (int i = 0; i <numbox; i++) {
			
			if (arr[i] == false) {
				arr[i] = true; 
				perm (numbox, toselect - 1, path + "b" + i, arr);
				arr[i] = false; 
			}
			
		}
	}

}
