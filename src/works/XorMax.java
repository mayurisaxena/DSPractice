package works;

import java.util.Scanner;

public class XorMax {
	
	class TrieNode {
		int value ;
		TrieNode[] node;
		TrieNode() {
			value = -1;
			node = new TrieNode[2];
			node[0] = node[1] = null;
		}
	}
	
	TrieNode root;
	int k = 3;
	
	void insertNode(int x) {
		TrieNode temp = this.root;
		int r[] = new int[k];
		int z =x ;
		for (int i =0 ; i<k ; i++) {
			r[i] = x%2;
			x=x/2;
		}
		
		for (int i = 0 ; i < k ; i++) {
			if (temp.node[r[i]] == null) {
				temp.node[r[i]] = new TrieNode();
			}
			temp = temp.node[r[i]]; 
		}
		temp.value = z;
		
	}
	
	private void printTrie(TrieNode root) {
		// TODO Auto-generated method stub
		int i; 

	    if( root!= null){
	        System.out.println(root.value);
	    }


	    for( i = 0; i < 2; i++)
	        if( root.node[i] != null){
	            printTrie(root.node[i]);
	            System.out.println("c:"+i);
	        }

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] pref = new int[n];
		int[] suff = new int[n];
		
		arr[0] = scan.nextInt();
		pref[0] = arr[0];
		
		for (int i=1 ; i<n ; i++) {
			arr[i] = scan.nextInt();
			pref[i] = pref[i-1]^arr[i];
		}
		
		suff[n-1] = arr[n-1];
		for (int i=n-2; i>=0 ; i--) {
			suff[i] = suff[i+1]^arr[i];
		}
		
		XorMax obj = new XorMax();
		obj.root = obj.new TrieNode();
		
		for (int i=0;i<n;i++) {
			obj.insertNode(suff[i]);
		}
		
		obj.printTrie(obj.root);
		
	}

}
