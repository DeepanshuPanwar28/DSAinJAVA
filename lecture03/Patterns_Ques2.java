package lecture03;

public class Patterns_Ques2 {

	public static void main(String[] args) {
		int n = 5;
		int star = 1;
		int row = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= star) {
				System.out.print("* ");
				cst++; 
			}
			System.out.println();
			row++;
			star++;
		}
	}

}
