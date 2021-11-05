package Data_Structure_practice_problem;

class LinkedList {
	Node head;
	Node tail;

	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return newNode;
	}
}

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		System.out.println(list.toString());
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}