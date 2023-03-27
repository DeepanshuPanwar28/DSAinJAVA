package Lecture35;

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
			System.out.println(temp.data);
			temp = temp.next;
		}
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
		Node nn = new Node(ali);
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
}
