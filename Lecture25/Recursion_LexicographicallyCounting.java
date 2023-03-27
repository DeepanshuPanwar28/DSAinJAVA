package Lecture25;

public class Recursion_LexicographicallyCounting {

	public static void main(String[] args) {
		lexi(0, 1000); 
	}

	public static void lexi(int curr, int limit) {
		if (curr > limit) {
			return;
		}

		System.out.println(curr);
		int d = 0;
		if (curr == 0) {
			d = 1; 
		}
		for (; d <= 9; d++) {
			lexi(curr * 10 + d, limit);
		}
	}

}
