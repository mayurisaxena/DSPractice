package Sorting;

import java.util.Scanner;

public class QuickSOrt {

	static int arr[];
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		arr = new int[n];
		for (int i = 0; i< n; i++) {
			arr[i] = in.nextInt();
		}
		
		//quickSort(0 , n);
		quickSortFirst(0,n);
		printArray();
	}
	
	public static void quickSortFirst(int l , int h) {
		int i = l+1 , j = h-1;

		System.out.println("l:" + l + "h:" + h);
		if (i >= j) {
			return;
		}
		int p = arr[l];
		
		while (i<=j) {
			while (i< arr.length && arr[i] < p) {
				i++;
			}
			while (arr[j] > p) {
				j--;
			}
			
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;
		
		quickSortFirst(l,j-1);
		quickSortFirst(j+1,h);
	}
	
	public static void quickSort(int l , int h) {
		int middle = l + (h - l) / 2;
		int p = arr[middle];
		int i = l, j = h-1;
		
		if (l >= h)
			return;
		
		while (i <= j) {
			while (arr[i] < p) {
				i++;
			}
			while (arr[j] > p) {
				j--;
			}
			
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
				
			}
		}
		if (l < j) {
			quickSort(l , j);
		}
		if (i < h) {
			quickSort(i , h);
		}
		
		
		
		
	}
	
	public static void printArray() {
		System.out.println("Print");
		for (int i=0 ; i<  arr.length ; i++) {
			System.out.println(arr[i]) ;
		}
	}
}

