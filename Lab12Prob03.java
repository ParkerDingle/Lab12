/**
 * File: Lab12Prob03.java
 * Class: CSCI 1302
 * Author: Elizabeth Justus,Coury Ellison, Parker Dingle
 * Created on: May 5, 2025
 * Last Modified: May 5, 2025
 * Description: Create recursive reverse String Method
 */

public class Lab12Prob03 {
    public static void main(String[] args) {

        System.out.println(reverseString("HELLO"));
        System.out.println(reverseString("HELLO,", 2));

    }

    //Reverse recursive string method
    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }

    }

    public static String reverseString(String str, int index) {
        if (index == 0) {
            return str.valueOf(str.charAt(0));
        }
        return str.charAt(index) + reverseString(str, index - 1);


    }

}