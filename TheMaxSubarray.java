/*
The Maximum Subarray

Given an array A={a1,a2,...,aN} of N elements, find the maximum possible sum of a 

1. Contiguous subarray
2. Non-contiguous (not necessarily contiguous) subarray.

Empty subarrays/subsequences should not be considered.

Input Format:
First line of the input has an integer T. T cases follow.
Each test case begins with an integer N. In the next line, N integers follow representing the elements of array A.

Constraints:
1<=T<=10
1<=N<=10ˆ5
-10ˆ4 <= ai <= 10ˆ4
The subarray and subsequences you consider should have at least one element.

Output Format:
Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray. At least one integer should be selected and put into the subarrays (this may be required in cases where all elements are negative).

*/

    import java.io.*;
    import java.util.*;

    public class Solution {

        public static int mymax (int x, int y) {
		if (x>y) {
			return x;
		} else {
			return y;
		}
	   }
	public static int getMaxArray (int[] arr, int size) {
		int[] map = new int[size];
		for (int i = 0; i<size ; i++) {
			if (i == 0) {
				map[i] = arr[i];
			} else {
				map[i] = mymax((map[i-1]+arr[i]),arr[i]);
			}
		}
		int retval = 0; 
		for (int i =0 ; i<size; i++){
			if (map[i] > retval) {
				retval = map[i];
			}
		}
		return retval;
	}
	
	public static int getMaxNC (int[] arr, int size) {
		int retval = 0; 
		
		for (int i = 0; i<size;i++) {
			if (retval+arr[i] > retval) {
				retval = retval +arr[i];
			}
		}
		return retval;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        in.nextLine();

        for (int loop = 0; loop<n ; loop++) {
            int size = in.nextInt();
            in.nextLine();

            int[] arr = new int[size];
            for(int loop1 = 0; loop1 < size; loop1++ ) {
                arr[loop1] =  in.nextInt();
            }
            if (in.hasNextLine()) {
                in.nextLine();
            }

            System.out.println(getMaxArray(arr,size)+" "+getMaxNC(arr,size));
        }
    }
    }
