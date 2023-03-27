package Lecture22;

public class Recursion_Factorial {

	public static void main(String[] args) {
		System.out.println(Fac(5));
	}
	public static int Fac(int n) {
		if (n == 0) { // smallest problem
			return 1; 
		}
		//BP : Fac(n) 
		//SP : Fac( n - 1)
		int sp = Fac(n - 1);
		return sp * n; 
	}

}
