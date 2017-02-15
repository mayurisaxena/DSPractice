package linkedLists;

public class Stack {
	static class Node {
		int v;
		Node next;
		Node (int v) {
			this.v = v;
			next = null;
		}
	}
	
	static Node top;
	
	public static void insert(int v) {
		if (top == null) {
			top = new Node(v);
			return;
		}
		Node temp = new Node(v);
		temp.next = top;
		top = temp;
	}
	
	public static int pop() {
		if (top == null) {
			return 0;
		}
		int val = top.v;
		top = top.next;
		return val;
	}
	
	public static boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
	}
}
