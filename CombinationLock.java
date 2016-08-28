/*Combination Lock
Consider a -slot combination lock where each slot contains a dial numbered with the ten sequential decimal integers in the 
inclusive range from  to . In one operation, you can choose a slot and rotate the dial by one click, either in the positive 
direction (to increase the displayed number by ) or the negative direction (to decrease the displayed number by ). 
Note that, due to the cyclical nature of the dial, the next number after  is  and the number before  is ). 
For example, if the number  is currently displayed on the dial, you can rotate the dial to either  (positive direction) or 
(negative direction) in a single operation.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5; 
        char[] entry1 = new char[n];
        char[] entry2 = new char[n];
        for (int i =0; i<n; i++) {
            entry1[i] = Integer.toString(in.nextInt()).charAt(0);
        }
        in.nextLine();
        for (int i =0; i<n; i++) {
            entry2[i] = Integer.toString(in.nextInt()).charAt(0);
        }
        int diff = 0;
        for (int i =0; i<n; i++) {
            diff += Math.abs(entry1[i]-entry2[i])>5 ? 10-(Math.abs(entry1[i]-entry2[i])) : Math.abs(entry1[i]-entry2[i]);
        }
        System.out.println(diff);
    }
}
