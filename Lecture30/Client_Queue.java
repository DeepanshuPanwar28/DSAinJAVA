package Lecture30;

public class Client_Queue {

	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.add(10);
		Q.add(20);
		Q.display();
		Q.add(30);
		Q.add(40);
		Q.add(50);
		Q.display();
		Q.add(60);
		Q.peek(); 
	}

}
