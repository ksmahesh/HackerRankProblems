/*
Alternating Characters
Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases. 
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints
1<=T<=10
1<=length of string<=10ˆ5

*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int scanString(String test){
        int count = 0;
        char prev = 'X';
        for (int i =0; i<test.length();i++){
            if (prev == test.charAt(i)) {
                count++;
            } else {
                prev = test.charAt(i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in =  new Scanner (System.in);
        
        int n = in.nextInt();
        in.nextLine();
        
        for (int i=0; i<n ;i++) {
            System.out.println(Solution.scanString(in.nextLine()));
        }
    }
}

