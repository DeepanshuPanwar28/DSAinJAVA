package Lecture22;

public class Recursion_EnglishRuler {

	public static void main(String[] args) {
		
		createruler (4, 3); 
	}
	public static void createruler(int length, int Mtick) {
		for (int l = 0; l < length; l++) {
			for ( int t = 0; t <Mtick; t++){
				System.out.print("-");
			}
			System.out.println(l);
			pat(Mtick - 1); 
		}
		for ( int t = 0; t <Mtick; t++){
			System.out.print("-");
		}
		System.out.println(length);
	}
	public static void pat(int n) {
		// BP : pat(n)
		// SP : pat(n - 1)
		if ( n == 0) {
			return; 
		}
		pat (n - 1);
		
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		
		pat (n - 1); 
	}

}
