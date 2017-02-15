package linkedLists;

public class Solution {
	static long countMoves(int[] a) {
        int n = a.length;
        int flag = 0;
        int max1 = 0, max2 =0;
        int i1 =0, i2=0;
        
        int count = 0;
        int equal = 1;
        while (true) {
            
            for (int i =0 ; i<n-1; i++) {
                    if (a[i] == a[i+1]) {
                        equal++;
                    }
                }
            if (equal == n) {
                break;
            }
            equal = 1;
            
            max1 = 0; max2 =0;
            for (int i = 0 ; i < n ;i++) {
                if(max1 < a[i]){
				    max2 = max1;
                    i2 = i1;
				    max1 =a[i];
                    i1 =i;
                } else if(max2 < a[i]){
                        max2 = a[i];
                        i2 =i;
                }
            }
            if (flag == 0) {
                for (int i =0 ; i<n; i++) {
                    if (i!=i1) {
                        a[i]++;
                    }
                }
                flag = 1;
                count ++;
            } else {
                for (int i =0 ; i<n; i++) {
                    if (i!=i2) {
                        a[i]++;
                    }
                }
                flag = 0;
                count ++;
            }
            
        }
        
        return count;
    }
}
