package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPermutation {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		permutation("" , s);
	}
	
	private static void permutation(String perm, String word) { 
		if (word.isEmpty()) 
		{ System.out.println(perm + word); } 
		else { 
			for (int i = 0; i < word.length(); i++) 
			{ 
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length())); 
			}
			
		} 
		
	}

}


