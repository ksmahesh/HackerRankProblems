/*
LibraryFine
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:
1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0.)
2. If the book is returned after the expected return day but still within the same 
calendar month and year as the expected return date, fine = 15 Hackos x (#ofdaysLate).
If the book is returned after the expected return month but still within the same calendar year as the expected return date, fine = 500 Hackos x (#ofmonthsLate) .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.

Input Format:
The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned. 
The second line contains 3 space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).

Output Format:
Print a single integer denoting the library fine for the book received as input.

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        boolean fineflag = false;
        int fine = 0;
        if (y2 < y1) {
            fineflag = true;
            fine = 10000;
        } else if (m2 < m1 && !fineflag && (y2 == y1)) {
            fineflag = true;
            fine = 500 * (m1-m2);
        } else if (d2 < d1 && !fineflag && (m2 == m1) && (y2 == y1)) {
            fineflag = true;
            fine = 15 *(d1-d2);
        }
        if (fineflag) { System.out.println(fine);}
        else { System.out.println(fine);}
    }
}
