package Lecture22;

public class Recursion_Fibonacci {

	public static void main(String[] args) {
		System.out.println(Fib(4));
	}
	public static int Fib(int n) {
		if (n <= 1) {
			return n; 
		}
		int sp1 = Fib (n - 1);
		int sp2 = Fib(n - 2); 
	return sp1 + sp2; 
	}

}
