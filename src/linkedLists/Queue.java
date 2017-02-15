package linkedLists;

public class Queue {

	static class Node {
		int v;
		Node next;
		Node(int v) {
			this.v = v;
			next = null;
		}
	}
	
	static Node start;
	static Node end;
	
	static void insert(int v) {
		Node temp = new Node(v);
		if (start == null) {
			temp.next = start;
			end = temp;
			start = temp;
			return;
		}
		
		end.next = temp;
		end = temp;
		
	}
	
	static int dequeue() {
		if (start == null) {
			return 0;
		}
		int v = start.v;
		start = start.next;
		
		return v;
	}
	
	public static void main(String args[]) {
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		
	}
	
}
