package Lecture25;

public class Recursion_TowerOfHenoi {

	public static void main(String[] args) {
		tower(3, 'A', 'C', 'B'); 
	}
	public static void tower (int n, char scr, char dest, char help) {
		if (n == 0) {
			return; 
		}
		// BP: n disks
		// SP: n - 1 disks
		tower(n - 1, scr, dest, help);
		System.out.println(n + " from " + scr + " to " + dest);
		tower(n - 1, help, dest, scr);
	}

}
