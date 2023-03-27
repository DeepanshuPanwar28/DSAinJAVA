package Lecture35;

import java.util.LinkedList;
import java.util.Queue;

public class Queues_FirstNegativeK {

	public static void main(String[] args) {
		int [] arr = {-20, 10, -5, 4, 6, -9, -80, 60, 50};
		FirstNegativeNumK (arr, 3); 
	}
	public static void FirstNegativeNumK(int [] arr, int k) {
		Queue <Integer> Q = new LinkedList<>(); 
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				Q.add(i); 
			}
			
		}
		System.out.println(arr[Q.peek()]);
		for (int s = 1; s <= arr.length - k; s++) {
			if (Q.peek() == s - 1) {
				Q.poll(); 
			}
			int e = s + k - 1; 
			if (arr[e] < 0) {
				Q.add(e); 
			}
			System.out.println(arr[Q.peek()]);
		}
	}
}
