package Lecture22;

public class Recursion_IncreasingDecreasing {

	public static void main(String[] args) {
		PID(1, 4);
	}

	public static void PID(int s, int e) {
		if (s > e) {
		
			return;
		}
		System.out.println(s);
		PID (s + 1, e); 
		System.out.println(s); 
	}

}
