package Lecture13;

public class Palindrome {

	public static void main(String[] args) {
		String str = "nitin";
//		System.out.println(Palin(str));
//		substring(str); 
		System.out.println(PalinSS(str));
	}
	public static boolean Palin(String str) {
		int start = 0;
		int end = str.length() - 1; 
		while (start < end) {
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--; 
			} else {
				return false; 
			}
			
	}
		return true;
	}
	public static void substring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int s = i + 1; s <= str.length(); s++) {
				if (Palin(str.substring(i, s))) {
					System.out.println(str.substring(i, s));
				}
			
			}
		}
	}
	public static boolean PalinSS (String str) {
		int mid = str.length()/2; 
		int start = mid -1; 
		int end = mid + 1; 
		for (int i = 0; i < str.length(); i++) {
		while (start > 0 && end < str.length()) {
			if (str.charAt(start) == str.charAt(end)) {
				System.out.println(str.substring(start, end + 1));
				start--;
				end++; 
			} else {
				return false; 
			}
		}
		}
		return true; 
	
	}
}
