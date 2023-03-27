package Lecture22;

public class Recursion_PrintIncreasing {

	public static void main(String[] args) {
		PI(4);
	}
	public static void PI(int n) {
		if (n ==0) {
			return; 
		}
		PI(n - 1);
		System.out.println(n);
	}

}
