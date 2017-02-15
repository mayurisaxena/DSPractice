package linkedLists;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

	static int arr[][];
	static int n;
	static ArrayList<Integer> ar ;
	public static void main(String ars[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int m = in.nextInt();
		ar = new ArrayList<>();
		arr = new int[n][n];
		for (int i = 0; i<m;i++) {
			int p = in.nextInt();
			int q = in.nextInt();
			arr[p][q] = 1;
			arr[q][p] = 1;
		}
		
		dfs(3);
	}
	
	public static void dfs(int l) {
		Stack.insert(l);
		boolean check = true;
		while(!Stack.isEmpty()) {
			int v = Stack.pop();
			while (ar.contains(v) ) {
				if (Stack.isEmpty())
					break;
				v = Stack.pop();
			}
			ar.add(v);
			System.out.println(v);
			check = false;
			for (int i = 0 ; i < n ; i++) {
				if (arr[v][i] == 1) {
					if (!ar.contains(i))
						Stack.insert(i);
					check = true;
				}
			}
		}
		/*if (!Stack.isEmpty()) {
			int h = Stack.pop();
			while (!ar.contains(h) && !Stack.isEmpty())
				h = Stack.pop();
			
			dfs(h);
		}*/
		
	}
	
	
}


/*
7 8
0 1
1 3
3 4
4 6
0 2
2 3
2 5
5 6
  */

/*
7 7
0 1
1 3
3 4
4 6
0 2
2 3
5 6
  */
 