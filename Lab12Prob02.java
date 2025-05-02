/**
 * File: Lab12Prob01.java
 * Class: CSCI 1302
 * Author: Elizabeth Justus,Coury Ellison, Parker Dingle
 * Created on: May 5, 2025
 * Last Modified: May 5, 2025
 * Description: Create recursive reverse String Method
 */

public class Lab12Prob02 {
    public static void main(String[] args) {
        System.out.println(recursiveAbstract(7));
        System.out.println(reverseString("HELLO"));
    }

    //Reverse recursive string method
    public static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }

    }

    public static int recursiveAbstract(int n){
        if ( n == 0 ){
          return 1;
        } else if ( n == 1 ) {
            return 3;
        } else if ( n == 2 ) {
            return 4;
        } else {
            return recursiveAbstract(n-3) * (recursiveAbstract(n-2) - recursiveAbstract(n - 1));
    }
}
}