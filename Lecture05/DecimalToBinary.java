package Lecture05;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n = 251233;
		int mult = 1;
		int ans = 0;
		while (n !=0) {
			int digit = n % 2;
			ans = ans + digit * mult; 
			mult = mult * 10; 
			n = n / 2; 
		}
		System.out.println(ans);
	}
}