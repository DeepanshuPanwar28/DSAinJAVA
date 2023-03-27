package Lecture18;

import java.util.ArrayList;

public class ArrayListIntersection {

	public static void main(String[] args) {
		int arr[] =  {5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80};
		int arr2[] = {10,10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90}; 
		System.out.println(Intersection(arr, arr2)); 
		
	}
	public static ArrayList<Integer> Intersection (int [] arr, int [] arr2){
		ArrayList<Integer> hello = new ArrayList<Integer>(); 
		int idx1 = 0;
		int idx2 = 0; 
		int eidx1 = arr.length - 1; 
		int eidx2 = arr2.length - 1;
		while ( idx1 <= eidx1 && idx2 <= eidx2) {
			if (arr[idx1] == arr2[idx2]) {
				hello.add(arr[idx1]); 
				idx1++;
				idx2++;
			}
			else if (arr[idx1] < arr2[idx2]) {
				idx1++;
			}
			else {
				idx2++; 
			}
		}
		return hello; 
		
	}

}
