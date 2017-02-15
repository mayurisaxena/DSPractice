package linkedLists;

public class BST {

	public static class Node {
		int a;
		Node l;
		Node r;
	}
	static Node s;
	
	public static void insert(int k) {
		Node old = s;
		Node current = new Node();
		current.a = k;
		current.l = null;
		current.r = null;
		if (old == null) {
			old = current;
			s = old;
			return;
		} else {
			while (true) {
				
				if (k < old.a) {
					if (old.l == null) {
						old.l = current;
						break;
					}
					old = old.l;
				} else {
					if (old.r == null) {
						old.r = current;
						break;
					}
					old = old.r;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert(5);
		insert(6);
		insert(2);
		print(s);
	}

	public static void print(Node s) {
		if (s == null) {
			return;
		}
		print (s.l);
		System.out.println(s.a);
		print(s.r);
	}
	
}
