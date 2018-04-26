/**
 * This program demonstrates two entities typing in information in order to work on a secret project together.
 * It will accept user input about the pubic and private keys used by both entities.
 * It will display all of the key values (public, private, and shared) for that pair of entities.
 * The two members would be prompted with the questions asking for the base number and modulo which they will both type in.
 * They agreed upon these numbers.
 * They will also be asked for their names.
 * Both users select a private number to calculate a public-private number and shared secret number.
 * They do not know each other's numbers.
 * They will use these to calculate their public-private number which will be used for their shared-secret number.
 * @author Zoe Cooper
 * @verson 1.0
 */

package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //variable declarations
        double base;
        double moduloNumber;

        String name_1;
        String name_2;

        double privateNumber1;
        double privateNumber2;
        double sharedSecret1;
        double sharedSecret2;

        double publicPrivate1;
        double publicPrivate2;

        //Welcoming the users
        System.out.println("Welcome to the Shared Secret Project!");

        //Instantiated a Scanner object here

        Scanner stdin = new Scanner(System.in);


        //I looked up the Scanner class online to figure out which functions to use below.

        //Prompting the users for their agreed upon base and modulo values
        System.out.println("Enter the base value:");
        base = stdin.nextDouble();

        System.out.println("Enter the modulo value:");
        moduloNumber = stdin.nextDouble();

        //Asking for names and private numbers
        System.out.println("Enter name 1:");
        name_1 = stdin.next();

        System.out.println("Enter " + name_1 + "'s private number:");
        privateNumber1 = stdin.nextDouble();

        System.out.println("Enter name 2:");
        name_2 = stdin.next();

        System.out.println("Enter " + name_2 + "'s private number:");
        privateNumber2 = stdin.nextDouble();

        //Formulas
        publicPrivate1 = Math.pow(base, privateNumber1) % moduloNumber;
        publicPrivate2 = Math.pow(base, privateNumber2) % moduloNumber;

        sharedSecret1 = Math.pow(publicPrivate2, privateNumber1) % moduloNumber;
        sharedSecret2 = Math.pow(publicPrivate1, privateNumber2) % moduloNumber;

        //Printing out their keys
        System.out.println(name_1 + "'s keys are:");
        System.out.println("private:" + privateNumber1);
        System.out.println("public-private: " + publicPrivate1);
        System.out.println("shared secret: " + sharedSecret1);


        System.out.println(name_2 + "'s keys are:");
        System.out.println("private: " + privateNumber2);
        System.out.println("public-private: " + publicPrivate2);
        System.out.println("shared secret: " + sharedSecret2);

    }
}
