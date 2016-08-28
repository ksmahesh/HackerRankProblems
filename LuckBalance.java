/*
Luck Balance

Lena is preparing for an important coding competition that is preceded by N sequential preliminary contests. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers, Li and Ti:
Li is the amount of luck that can be gained by winning the contest. If Lena wins the contest, her luck balance will decrease by Li; if she loses it, her luck balance will increase by Li.
Ti denotes the contest's importance rating. It's equal to 1 if the contest is important, and it's equal to 0 if it's unimportant.
If Lena loses no more than  important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

Input Format:
The first line contains two space-separated integers, N(the number of preliminary contests) and K(the maximum number of important contests Lena can lose), respectively. 
Each line i of the N subsequent lines contains two space-separated integers, Li (the contest's luck balance) and Ti (the contest's importance rating), respectively.

Output Format:
Print a single integer denoting the maximum amount of luck Lena can have after all the contests.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int luck = 0;
        int[] arr = new int[n];
        int j = 0;
        for (int a_i=0;a_i<n;a_i++) {
            int temp = in.nextInt();
            if (in.nextInt() == 1) {arr[j++] = temp;}
            else {if(temp>=0) {luck+=temp;}}
        }
        int[] a2 =  new int[j];
        for (int kl =0;kl<j;kl++) {
            a2[kl] = arr[kl];
        }
        Arrays.sort(a2);
        int minus = j-k;
        for (int count=0;count<j;count++) {if (minus>0){luck-=a2[count];minus--;} else luck+=a2[count];}
        System.out.println(luck);
    }
}
