package Lecture22;

public class Recursion_PrintDecreasingIncreasing {

	public static void main(String[] args) {
		PDI (4); 
	}
	public static void PDI (int n) {
		if (n == 0) {
			return; 
		}
		System.out.println(n);
		PDI (n - 1);
		System.out.println(n);
	}

}
