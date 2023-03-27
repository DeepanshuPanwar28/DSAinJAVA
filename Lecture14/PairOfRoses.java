package Lecture14;

public class PairOfRoses {

	public static void main(String[] args) {
		int [] roses = {10, 2, 6, 8, 4};
		int A = 10; 
//		ans(roses, A); 
		sort(roses) ;
		display(roses); 
		
	}
	public static void ans (int [] roses, int A) {
		for (int i = 0; i < roses.length ; i++) {
			
		}
	}
	public static void sort (int [] roses) {
		for (int count = 1; count < roses.length; count++) {
		int last = roses.length - count;  
		int max = last; 
		for (int i = 0; i <= last; i ++) {
			if (roses[i] > roses[max]) {
				max = i; 
			}
		}
		int temp = roses[max]; 
		roses[max] = roses[last]; 
		roses[last] = temp; 
		}
	}
	public static void display (int[] roses) {
		for (int i : roses) {
			System.out.print(i + " ");
		}
	}

}
