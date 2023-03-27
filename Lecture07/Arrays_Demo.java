package Lecture07;

public class Arrays_Demo {

	public static void main(String[] args) {
	int [] a1 = {1, 2, 3, 4};
	int [] a2 = {23,12,14,7}; 
	System.out.println((a1[0] + ":" + a2[0]));
	swap(a1[0], a2[0]); 
	System.out.println((a1[0] + ":" + a2[0]));
	}
	public static void swap (int  a, int  b){
		int c = a; 
		a = b; 
		b = c; 
	}

}
