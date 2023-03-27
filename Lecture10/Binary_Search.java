package Lecture10;

public class Binary_Search {

	public static void main(String[] args) {
		int [] arr = {5, 7, 11, 12, 15, 20, 31, 33, 35, 40, 45, 55, 58, 66, 71};
		
		System.out.println(Find(arr, 5));
	}
	public static int Find(int arr[], int ele) {
		int s = 0;
		int e = arr.length - 1; 
		while (s <= e) {
//			int mid = (s + e)/ 2;
			int mid = s + (e - s)/2; 
			if (arr[mid] == ele){
				return mid; 
			} else if (arr[mid] > ele) {
				e = mid - 1; 
			} else  {
				s = mid + 1; 
			}
			 
		}
		return -1;
	}

}
