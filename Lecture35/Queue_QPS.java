package Lecture35;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {

	public static void main(String[] args) {
		Queue <Integer> Q = new LinkedList<>(); 
		Q.add(10); 
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		System.out.println(Q);
		printreverse(Q, 0); 
		System.out.println();
		System.out.println(Q);
		
	}
	public static void reverse(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return; 
		}
		int temp = Q.poll(); 
		reverse(Q); 
		System.out.print(temp + " ");
		Q.add(temp); 
		
	}
	public static void printreverse(Queue<Integer> Q, int count) {
		if (Q.size() == count) {
			return; 
		}
		int temp = Q.poll(); 
		Q.add(temp); 
		printreverse(Q, count + 1); 
		System.out.print(temp + " ");
		
	}

}
