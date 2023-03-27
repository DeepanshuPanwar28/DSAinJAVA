package Lecture07;

public class Function_Demo {

	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		System.out.println(a + " : " + b); 
		swap(a, b);
		System.out.println(a + " : " + b);
	}
	public static void swap (int a, int b) {
		System.out.println(a + " : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " : " + b);
		int backup = return1(10);
		System.out.println(backup);
//		System.out.println(hello);
	}
	public static int return1(int a) {
		int hello = 4; 
		return hello; 
	}
	

}
