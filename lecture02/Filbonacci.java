package lecture02;

public class Filbonacci {

	public static void main(String[] args) {
		int i = 1;
		int a = 0;
		int b = 1;
		while (i <= 5) {
			int c = a + b;
//			System.out.println(c);
			a = b;
			b = c;
			i++; 
		}
		System.out.println(a);
	}
}