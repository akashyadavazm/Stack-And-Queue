package practice;

public class DoublyLinkedListDemo {

	class Node {
		int data;
		Node next;
		Node previous;

		public Node(int data) {
			this.data = data;
		}

	}

	Node head, tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;

		}

	}

	public void display() {

		Node temp = tail;
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Nodes of doubly linked list ");
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.previous;
		}

	}

	public static void main(String[] args) {

		DoublyLinkedListDemo demo = new DoublyLinkedListDemo();
		demo.addNode(10);
		demo.addNode(20);
		demo.addNode(30);
		demo.addNode(40);
		demo.addNode(50);

		demo.display();

	}

}