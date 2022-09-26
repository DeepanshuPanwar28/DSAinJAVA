package lecture03;

public class Patterns_Ques6 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int star2 = n - 1;
		while (row <= n) {
			int cst = 4;
			while (cst > star2) {
				System.out.print("    ");
				cst--;
			}
			int hello = 5;
			while (hello >= star) {
				System.out.print("* ");
				hello--;
			}
			System.out.println();
			row++;
			star2--;
			star = star + 1;

		}
	}

}
