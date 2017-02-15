package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n ;i++) {
			a[i] = in.nextInt();
		}
		
		for (int i =0 ;i <n ; i++) {
			int min = i;
			for (int j = i+1; j<n ; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(int i = 0; i<n ;i++) {
			System.out.println(a[i]);
		}
		
	}
	
}
