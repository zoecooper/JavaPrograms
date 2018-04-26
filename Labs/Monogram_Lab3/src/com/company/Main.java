package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //variable declarations
        String userInput;

        //scanner
        Scanner stdin = new Scanner(System.in);

        //Prompt the user for monogram.
        System.out.println("Enter a monogram:");
        userInput = stdin.next();

        if(userInput.length() > 3){
            System.out.println("Monogram does not contain 3 characters.");
        }
        if(userInput.length() == 3) {
            System.out.println("Monogram has the correct length.");
        }

        if (Character.isLetter(userInput.charAt(0))) {
            System.out.println("Monogram is valid.");
        }
        else if (Character.isLetter(userInput.charAt(1))) {
            System.out.println("Monogram is valid.");
        }
        else if (Character.isLetter(userInput.charAt(2))) {
            System.out.println("Monogram is valid.");
        }
        else{
            System.out.println("Monogram must contain only characters.");
        }

        // write your code here
    }
}
