package Lecture09;

public class RotateAnArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Display(arr);
		RotateWithLoop(arr, 2);
		RotateWithoutLoop(arr, 2); 
		Display(arr);

	}

	public static void RotateWithLoop(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int r = 0; r < rot; r++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
		}

	}

	public static void Display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void Reverse (int [] arr, int left, int right) {
		while (left < right) {
			int temp = arr[right]; 
			arr[right] = arr[left];
			arr[left] = temp; 
			left++;
			right--; 
		}
		
	}
	public static void RotateWithoutLoop(int [] arr, int rot) {
		rot = rot % arr.length; 
		Reverse(arr, 0, arr.length - 1); 
		Reverse(arr, 0, rot - 1); 
		Reverse(arr, rot, arr.length - 1); 
		
	}
}
