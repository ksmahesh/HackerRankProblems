/*
Number of Sequences

A sequence of n integers is nice if the following conditions are satisfied:
0<=ak<=(k-1),
ak== am mod k for all pairs k,m such that k divides m.
You're given a sequence, a1,....,an, where some numbers may be -1. Find and print the number of nice sequences you can create by changing each -1 to a non-negative integer. As this number can be quite large, your answer must be modulo 10^9 + 7.

Input Format:
The first line contains a single integer, n.
The second line contains n space-separated integers describing the respective values of a1,....,an.

Output Format:
Print a single integer denoting the number of nice sequences you can get by changing each -1 to a non-negative integer. As this number can be quite large, your answer must be modulo 10^9 + 7.

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        long p_acc = 1;
        long cap = (10^9+7);
        for (int i = 0; i<n;i++) {
        	if (a[i] == -1) {
        		p_acc *=(i+1);
        	}
        	if (p_acc > cap ) {
        		p_acc = p_acc % cap;
        	}
        }
        System.out.println(p_acc);
    }
}