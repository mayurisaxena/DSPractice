package linkedLists;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int k = in.nextInt();
		int l = 0, h = n-1;
		int mid =  l + ((l + h) / 2);
		while (l<=h) {
			
			if (arr[mid] < k) {
				l = mid + 1;
			} else if (arr[mid] > k){
				h = mid - 1;
			}
			else {
				System.out.println(mid);
				break;
			}
			mid = ((l + h) / 2);
		}
	}
}
