package String;

import java.util.Scanner;

public class StringReverse {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		char[] ch = a.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = ch.length-1 ; i >=0 ; i--) {
			sb.append(ch[i]);
		}
		System.out.println(sb);
	}
	
}
