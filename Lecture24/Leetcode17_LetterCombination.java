package Lecture24;

public class Leetcode17_LetterCombination {

	public static void main(String[] args) {
		LC("567", ""); 
	}
	public static void LC(String word, String combo) {
		if (word.isEmpty()) {
			System.out.println(combo);
			return;
		}
		char ch = word.charAt(0); 
		String op = options(ch); 
		String remain = word.substring(1); 
		for (int i = 0; i < op.length(); i++) {
			LC(remain, combo + op.charAt(i)); 
		}
		
	}

	public static String options(char ch) {
		if (ch == '2') {
			return "abc";

		} else if (ch == '3') {
			return "def";

		} else if (ch == '4') {
			return "ghi";

		} else if (ch == '5') {
			return "jkl";

		} else if (ch == '6') {
			return "mno";

		} else if (ch == '7') {
			return "pqrs";

		} else if (ch == '8') {
			return "tuv";

		} else if (ch == '9') {
			return "wxyz";

		} else {
			return ""; 
		}

	}

}
