package Lecture34;

import java.util.Stack;

public class Stack_PrintReverse {

	public static void main(String[] args) {
		Stack<Integer> S = new Stack<Integer>(); 
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		reverse(S); 
	}
	public static void reverse(Stack <Integer> S) {
		if (S.isEmpty()) {
			return; 
		}
		int temp = S.pop(); 
		reverse(S); 
		System.out.print(temp);
		S.push(temp); 
	}

}
