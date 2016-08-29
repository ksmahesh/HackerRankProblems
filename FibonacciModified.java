/*
Fibonacci Modified
We define a modified Fibonacci sequence using the following definition

For example, if term t1=0 and t2=1, term t3=0+1ˆ2=1, term t4=1+1ˆ2=2, term t5=1+2ˆ2=5, and so on.

Given three integers, t1, t2, and n, compute and print term tn of a modified Fibonacci sequence.

Note: The value of tn may exceed the range of a 64-bit integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to be more creative in your solution to compensate for the limitations of your chosen submission language.

Input Format:
A single line of three space-separated integers describing the respective values of t1, t2, and n.

Constraints:
0<=t1,t2<=2
3<=n<=20
tn  may exceed the range of a 64-bit integer.
Output Format

Print a single integer denoting the value of term tn in the modified Fibonacci sequence where the first two terms are t1 and t2.

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       long t0,t1;
       int n;
       t0 = in.nextLong();
       t1 = in.nextLong();
        n = in.nextInt();
       in.nextLine();
       long[] arr = new long[n] ;
        arr[0] = t0;
        arr[1] = t1;
        
        for (int i = 2; i<n;i++ ){
            arr[i] = arr[i-2]+(arr[i-1]*arr[i-1]);
        }
        System.out.println(arr[n-1]);
    }
}
