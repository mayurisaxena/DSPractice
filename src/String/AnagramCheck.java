package String;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		StringBuffer b1 = new StringBuffer(b);
		
		char ch[] = a.toCharArray();
		for (int i = 0; i<ch.length ; i++) {
			char k = ch[i];
			if (b1.indexOf(""+k) >=0 ) {
				b1.deleteCharAt(b1.indexOf(""+k));
				continue;
			} else {
				break;
			}
		}
		if(b1.length()>0) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
		
	}
	
}
