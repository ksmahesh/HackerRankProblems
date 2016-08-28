/*
Super Reduced String

Shil has a string, S, consisting of N lowercase English letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabbcc" would become either "aab" or "bbc" after 1 operation.

Shil wants to reduce S as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Shil out by finding and printing S's non-reducible form!

Note: If the final string is empty, print Empty String.

Input Format:
A single string, S.

Constraints:
1<=N<=100

Output Format:
If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String input = in.nextLine(); 
        String output = "";
        char prev = input.charAt(0);
        for (int i =0; i<input.length(); i++) {
            if (prev != input.charAt(i)){
                output += Character.toString(prev);
                prev = input.charAt(i);
            } 
        }
        if (output.length()==0){
            System.out.println("Empty String");
        } else {
            System.out.println(output);
        }
    }
}

