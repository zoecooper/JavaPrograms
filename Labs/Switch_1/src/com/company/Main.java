package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String s;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a single digit number between 0 and 9:");
        s = stdin.next();

        switch(s.charAt(0)){
            case '0': System.out.println("You entered a zero.");
                      break;
            case '1':
            case '3':
            case '5':
            case '7':
            case '9': System.out.println("You entered an odd number.");
                      break;
            case '2':
            case '4':
            case '6':
            case '8': System.out.println("You entered an even number.");
                      break;
            default: System.out.println("ERROR: Bad input character: " + s);

        }
        // write your code here
    }
}
