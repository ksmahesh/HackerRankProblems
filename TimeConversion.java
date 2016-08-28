/*
Time Conversion
Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00 AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00 PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Input Format:
A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01<=hh<1=2.

Output Format:
Convert and print the given time in 24-hour format, where 00<=hh<=23.	
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] times = new String[5];
        
        times = time.split(":",2);
        
        CharSequence cs1 = "PM";
        CharSequence cs2 = "";
        boolean PMFlag = times[1].contains(cs1);
        times[1] = times[1].replace(cs1,cs2);
        if (PMFlag) {
            int hh = Integer.parseInt(times[0]);
            hh +=12;
            
            System.out.println(hh+":"+times[1]);
        } else {
            System.out.println(times[0]+":"+times[1]);
        }
      
    }
}
