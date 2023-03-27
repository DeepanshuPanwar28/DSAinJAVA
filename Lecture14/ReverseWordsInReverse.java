package Lecture14;

public class ReverseWordsInReverse {

	public static void main(String[] args) {
		String str = "the sky is blue"; 
		reverse(str); 
	}
	public static void reverse (String str) {
		
		while (true) {
			int lastsp = str.lastIndexOf(" "); 
			String word = str.substring(lastsp + 1); 
			System.out.println(word);
			if (lastsp == -1) {
				break; 
			}
			str = str.substring(0, lastsp); 
		}
		
	}
}
