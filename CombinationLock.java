/*Combination Lock

Consider a -slot combination lock where each slot contains a dial numbered with the ten sequential decimal integers in the inclusive range from 0 to 9. 
In one operation, you can choose a slot and rotate the dial by one click, either in the positive direction (to increase the displayed number by 1) 
or the negative direction (to decrease the displayed number by 1). Note that, due to the cyclical nature of the dial, the next number after 9 is 0 and the number before 0 is 9). 
For example, if the number 0 is currently displayed on the dial, you can rotate the dial to either 1 (positive direction) or 9 (negative direction) in a single operation.
Given the initial configuration of numbers in each slot and some desired configuration of numbers, determine the minimum number of operations you must perform to 
change the lock's slots to the desired configuration.
Input Format:
The first line contains  space-separated integers denoting the current slot configuration. 
The second line contains  space-separated integers denoting the desired slot configuration.
Output Format:
Print a single integer denoting the minimum number of moves to change this configuration to the correct one.

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
