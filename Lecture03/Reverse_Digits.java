package Lecture03;

public class Reverse_Digits {

	public static void main(String[] args) {
		int n = 1000;
		int reverse = 0; 
		while (n != 0) {
			int digit = n % 10; 
//			System.out.println(digit);
			n = n/10; 
//			count++; 
			reverse = reverse * 10 + digit; 
		}
		System.out.println(reverse);
		
	}

}
