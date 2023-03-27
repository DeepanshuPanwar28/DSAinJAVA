package Lecture06;

public class Rotate_NumberWithoutLoop {

	public static void main(String[] args) {
		int n = 123456;
		int temp = n;
		int count = 0;
		while (temp !=0) {
			temp = temp / 10;
			count++; 
		}
		int rot = 123123;
		rot = rot % count; 
		int mult = (int)Math.pow(10, rot);
		int rem = n % mult; 
		int q = n/mult;
		System.out.println(rem + " " + q);
		int mult2 = (int)(Math.pow(10,  count - rot)); 
		int ans = mult2 * rem + q; 
		System.out.println(ans);
	}

}
