package Lecture23;

public class CoinToss {

	public static void main(String[] args) {
		toss(3, ""); 
	}
	public static void toss(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return; 
		}
		toss(n - 1, path + "H");
		toss (n - 1, path + "T");
	}

}
