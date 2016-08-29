/*
Making Polygons

A polygon is a closed shape with three or more sides. For example, triangles are polygons. A polygon is non-degenerate if it has no overlapping sides (and no sides of zero length).

You have  sticks with positive integer lengths, a0,a1,...an-1. You want to create a polygon using all  sticks. Because this is not always possible, you can cut one or more sticks into two smaller sticks (they do not necessarily need to be of integer length) and repeat the process of trying to create a polygon using all the sticks. Given the lengths of all n sticks, find and print the minimum number of cuts necessary to make a non-degenerate polygon.

Input Format:
The first line contains a single integer, n.
The second line contains n space-separated integers describing the respective values of a0,a1,...an-1.

Constraints:
1<=n<=50
1<=ai<=100

Output Format:
Print a single integer denoting the minimum number of cuts required to make the  sticks into a polygon.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        if (n == 1) {
        	System.out.println("2");
        } else if (n == 2) {
        	System.out.println("1");
        } else {
        	int sum = 0;
        	for (int i =0;i<n;i++) {
        		sum+=a[i];
        	}
        	int count = 0 ;
        	for (int i = 0;i<n;i++ ) {
        		if (a[i]>=(sum - a[i])) {
        			count++;
        		}
        	}
        	System.out.println(count);
        }
    }
}
