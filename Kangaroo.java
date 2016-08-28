/*
Kangaroo
There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity). The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump. The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump. Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land at the same location at the same time?

Input Format:
A single line of four space-separated integers denoting the respective values of x1, v1, x2, and v2.

Output Format:
Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        boolean flag = false; 
        int d1 = x2-x1;
        while (true) {
            x1+=v1;
            x2+=v2;
            if (d1>x2-x1) {d1=x2-x1; if(x1==x2){flag=true; break;}}
            else if (d1==x2-x1) {continue;} else {break;}
        }
        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
