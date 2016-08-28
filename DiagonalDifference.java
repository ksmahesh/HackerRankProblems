/*DiagonalDifference
Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.
Input Format:
The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.
Output Format:
Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
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
        int a[][] = new int[n][n];
        int i = -1;
        int d1 = 0;
        int d2 = 0;        
        for(int a_i=0; a_i < n; a_i++){
            i++;
            for(int a_j=0; a_j < n; a_j++){
                int temp = in.nextInt();
                if (a_j==i) {d1+=temp;}
                if (a_j == (n-i-1)){d2+=temp;}
            }
        }
        System.out.println(d1-d2>0?(d1-d2):-1*(d1-d2));
    }
}
