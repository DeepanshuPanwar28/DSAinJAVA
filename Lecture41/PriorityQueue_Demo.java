package Lecture41;

import java.util.PriorityQueue;

public class PriorityQueue_Demo {

	public static void main(String[] args) {
		PriorityQueue <Integer> PQ = new PriorityQueue<Integer>(); 
		PQ.add(100);
		PQ.add(20);
		PQ.add(25);
		PQ.add(3);
		PQ.add(50);
		System.out.println(PQ);
		
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
	}

}
