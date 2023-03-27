package Lecture24;

public class Recursion_ClimbingStairs {

	public static void main(String[] args) {
		Stairs(0, 3, ""); 
//		Stairs_comb(0, 0, 4, ""); 
	}
	public static void Stairs(int curr, int dest, String path) {
		if (curr == dest) {
			System.out.println(path);
			return; 
		} else if (curr > dest) {
			return; 
		}
		Stairs(curr + 1, dest, path + 1);
		Stairs(curr + 2, dest, path + 2);
		Stairs(curr + 3, dest, path + 3); 
		Stairs(curr + 4, dest, path + 4);
	}
	public static void Stairs_comb(int curr, int lastjump, int dest, String path) {
		if (curr == dest) {
			System.out.println(path);
			return; 
		} else if (curr > dest) {
			return; 
		}
		if (lastjump <= 1) {
			Stairs_comb(curr + 1, 1, dest, path + 1);
		}
		if (lastjump <= 2) {
			Stairs_comb(curr + 2, 2,dest, path + 2);
		}
		if (lastjump <= 3) {
			Stairs_comb(curr + 3, 3,dest, path + 3); 
		}
		if (lastjump <= 4) {
			Stairs_comb(curr + 4, 4,dest, path + 4);
		}
		
	}

}
