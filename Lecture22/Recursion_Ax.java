package Lecture22;

public class Recursion_Ax {

	public static void main(String[] args) {
		System.out.println(hello(5, 7));
	}
	public static int hello (int b, int p) {
		// BP : 5^7
		// SP : 5^6
		if (p < 1) {
			return 1;
		}
		int ans = hello(b, p - 1); 
		return b * ans; 
	}

}
