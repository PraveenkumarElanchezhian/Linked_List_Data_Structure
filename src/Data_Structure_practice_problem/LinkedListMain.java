package Data_Structure_practice_problem;
import java.util.LinkedList;
/*class LinkedList {
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

	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	public Node append(int data) {
		return head;

	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}*/

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(30);
		list.add(40);
		list.add(70);
		
		System.out.println(list);
	}
}
