package String;

public class StringZigZag {

	public static void main(String args[]) {
		StringZigZag obj = new StringZigZag();
		System.out.println(obj.zigZag("GeeksForGeeks",3));
	}

	private String zigZag(String string , int n) {
		String[] arr = new String[n];
		int j =-1;
		boolean down = true;
		String result = "";
		for (int i =0 ; i<string.length() ; i++) {
			if (down) {
				j++;
			} else {
				j--;
			}
			if (j==0) {
				down = true;
			}
			if (j == n-1) {
				down = false;
			}
			
			if (arr[j] == null) {
				arr[j] = "";
			}
			arr[j] = arr[j] + string.charAt(i);
			
		}
		for (int k = 0;k<n;k++) {
			result = result + arr[k];
			System.out.println(k + arr[k]);
		}
		return result;
	}
	
	
	
}
