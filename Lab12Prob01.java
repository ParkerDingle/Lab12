/**
 * File: Lab12Prob01.java
 * Class: CSCI 1302
 * Author: Elizabeth Justus,Coury Ellison, Parker Dingle
 * Created on: May 5, 2025
 * Last Modified: May 5, 2025
 * Description: Recursion
 */

public class Lab12Prob01 {
    public static void main(String[] args) {
        System.out.println(recursiveAbstract(7));
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