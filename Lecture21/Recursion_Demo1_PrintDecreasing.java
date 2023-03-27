package Lecture21;

public class Recursion_Demo1_PrintDecreasing {

	public static void main(String[] args) {
		pd(4); 
	}
	public static void pd (int n) {
		if (n == 0) {
			return; 
		}
		
		System.out.println(n);
		pd(n - 1); 
	}

}
