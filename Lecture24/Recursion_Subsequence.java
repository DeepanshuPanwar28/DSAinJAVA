package Lecture24;

public class Recursion_Subsequence {

	public static void main(String[] args) {
		SubSequence("abcd", ""); 
	}
	public static void SubSequence(String word, String team) {
		if (word.isEmpty()) {
			System.out.println(team);
			return; 
		}
		char ch = word.charAt(0); 
		String remain = word.substring(1); 
//		System.out.println("-->" + remain);
		SubSequence(remain, team + ch);
		SubSequence(remain, team); 
		//SubSequence(remain, team + (int)(ch - 'a' + 1));
	}

}
