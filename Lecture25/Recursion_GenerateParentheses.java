package Lecture25;

public class Recursion_GenerateParentheses {

	public static void main(String[] args) {
		generate(3, 3, ""); 
	}
	public static void generate(int open, int close, String path) {
		if (open == 0 && close == 0) {
			System.out.println(path);
			return; 
		}
		if (open > close) {
			return; 
		}
		if (open > 0) {
			generate(open - 1, close, path + "(");
		}
		if (close > 0) {
			generate(open, close - 1, path + ")");
		}
		
		
	}

}
