/*
Cookie Party

You're having a cookie party tonight! You're expecting n guests and you've already made m cookies. You want to distribute all the cookies evenly between your guests in such a way that each guest receives the same number of whole cookies. If there are not enough cookies to give everyone the same amount, you must make some number of additional cookies.

Given n and m, find and print the minimum number of additional cookies you must make so that everybody receives the same number of cookies.

Input Format:
A single line of two space-separated integers describing the respective values of n and m.

Constraints:
1<=n,m<10ˆ9

Output Format:
Print a single integer denoting the number of additional cookies you need to make so that everyone at the cookie party has the same number of whole cookies.

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
        int m = in.nextInt();
        //in.nextLine();
        if (m <= n) {
            System.out.println(n-m);
        } else {
            int p_div = (int) m/n;   
            int diff = m - (n*p_div);
            if (m%n == 0) {
            	System.out.println(p_div);
            } else {
                System.out.println(n-diff);
            }
            
        }

    }
}
