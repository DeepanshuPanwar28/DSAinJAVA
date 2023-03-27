package Lecture21;

public class Strings_Dhoka {

	public static void main(String[] args) {
		String str = ""; 
		int n = 100000; 
		StringBuilder sb = new StringBuilder(); 
		long start = System.currentTimeMillis(); 
		for (int i = 0; i < n; i++) {
//			str = str + i; // --> O(n) theoretically 
			sb.append(i); // O(1) 
//			int lol = 2;  // --> this line is running in O(n)
		}
		long end = System.currentTimeMillis(); 
		System.out.println((end - start)/1000.0);
		
		String ans = sb.toString(); 
		System.out.println(ans);
	}

}
