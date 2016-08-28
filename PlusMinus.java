/*PlusMinus
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10-4 are acceptable.

Input Format:
The first line contains an integer, N, denoting the size of the array. 
The second line contains N space-separated integers describing an array of numbers .

Output Format:
You must print the following 3 lines:
1. A decimal representing of the fraction of positive numbers in the array.
2. A decimal representing of the fraction of negative numbers in the array.
3. A decimal representing of the fraction of zeroes in the array.

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
        int p=0;
        int z=0;
        int m =0;
        for(int arr_i=0; arr_i < n; arr_i++){
            int temp = in.nextInt();
            if (temp >0){p++;}
            else if (temp==0){z++;}
        }
        m = n-p-z;
        System.out.printf("%.6f\n",(double)p/n);
        System.out.printf("%.6f\n",(double)m/n);
        System.out.printf("%.6f\n",(double)z/n);        
    }
}
