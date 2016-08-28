/* Staircase
Consider a staircase of size :
   #
  ##
 ###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
Write a program that prints a staircase of size n.

Input Format:
A single integer, n, denoting the size of the staircase.

Output Format:
Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it.

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
        int num = 1;
        for (int j =0;j<n;j++){
        for(int i =0;i<n;i++){
            if (i>=(n-num)) {System.out.print("#");}
            else {System.out.print(" ");}
        }
        num++;
            System.out.println();
        }
    }
}
