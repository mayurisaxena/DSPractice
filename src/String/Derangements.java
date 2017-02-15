package String;

import java.util.Scanner;

public class Derangements {
	
	public static void main(String args[] ) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int der[] = new int[n+1];
		der[0] = 1;
		der[1] = 0;
		der[2] = 1;
		
		for (int i =3 ; i<=n ; i++) {
			der[i] = (i-1)*(der[i-1]+der[i-2]);
		}
		System.out.println(der[n]);
	}

}
