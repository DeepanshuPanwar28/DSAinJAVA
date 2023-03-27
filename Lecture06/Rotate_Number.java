package Lecture06;

import java.util.Scanner;

public class Rotate_Number {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		int rot = scn.nextInt();
		int n2 = n; 
		int count = 0;
		int ans = 0;
		while (n2 !=0) {
			n2 = n2/10;
			count++; 
		}
		for (int i = 0; i < rot % count ; i++) {
			int rem = n % 10; 
			int q = n / 10;
			ans = q + rem * (int)(Math.pow(10,  count - 1)); 
			n = ans; 
		}
		System.out.println(ans);
		
		}
		
	

}
