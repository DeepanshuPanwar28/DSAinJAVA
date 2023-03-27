package Lecture36;

import java.util.Stack;

public class LinkedList {

	class Node {
		public Node(int ali) {
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int Size() {
		int s = 0;
		Node temp = head;
		while (temp != null) {

			System.out.println(temp.data);
			temp = temp.next;
			s++;
		}
		return s;

	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		Node temp = head;
		while (temp.next != null) {

			temp = temp.next;

		}
		return temp.data;
	}

	public int getAt(int i) {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		if (i < 0 || i > Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = head;
		for (int count = i; count <= i; count++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getLastNode() {
		Node temp = head;
		while (temp.next != null) {

			temp = temp.next;

		}
		return temp;

	}

	public void addLast(int ali) {
		Node nn = new Node(ali);
		if (isEmpty()) {
			head = nn;
			return;
		}
		Node last = getLastNode();
		nn = new Node(ali);
		last.next = nn;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;

	}

	public Node getAtNode(int i) {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		if (i < 0 || i > Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node temp = head;
		for (int count = i; count <= i; count++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int idx, int ali) {
		if (idx == 0) {
			addFirst(ali);
			return;
		} else if (idx == Size()) {
			addLast(ali);
			return;
		}
		if (idx < 0 || idx > Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node prev = getAtNode(idx - 1);
		Node after = prev.next;
		Node nn = new Node(ali);
		prev.next = nn;
		nn.next = after;
	}

	public int removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		if (Size() == 1) {
			int ans = head.data;
			head = null;
			return ans;
		}
		Node second_last = getAtNode(Size() - 2);
		Node last = second_last.next;

		second_last.next = null;
		return last.data;

	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		int ans = head.data;
		head = head.next;
		return ans;

	}

	public int removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == Size() - 1) {
			return removeLast();
		}
		if (idx < 0 || idx >= Size()) {
			throw new IndexOutOfBoundsException();
		}
		Node prev = getAtNode(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;

		prev.next = after;
		return curr.data;
	}

	public void Reverse() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		head = prev;
	}

	private void Reverse2(Node prev) {
		if (prev.next == null) {
			return;
		}
		Node curr = prev.next;
		Reverse2(curr);
		curr.next = prev;

	}

	public int lastKDist(int k) {
		Node c2 = head;
		for (int i = 0; i < k; i++) {
			c2 = c2.next;

		}
		Node c1 = head;
		while (c2 != null) {
			c1 = c1.next;
			c2 = c2.next;

		}
		return c1.data;
	}

	public void revK(int k) {
		Node nn = head;
		Stack<Node> S = new Stack<>();
		Node last = null;
		Node start = null; 
		while (nn != null) {
			Node after = nn.next;
			S.add(nn);
			if (S.size() == k) {
				while (!S.isEmpty()) {
					Node curr = S.pop();
					if (last == null) {
						start = curr;
						last = curr;
					} else {
						last.next = curr;
						last = curr;
					}

				}
			}

			nn = after;
		}
		last.next = null;
	}
}
