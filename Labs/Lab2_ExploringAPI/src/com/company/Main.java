package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //variable declarations
        double diameter1; //the diameters of the 3 different garden plots
        double diameter2;
        double diameter3;

        double price1; //the unit price of the two different materials to compare
        double price2;

        double circumference1; //the circumference of the 3 different garden plots
        double circumference2;
        double circumference3;

        double area1; //the area of the 3 different garden plots
        double area2;
        double area3;

        //Instantiate a Scanner object called stdin to read from System.in
        Scanner stdin = new Scanner(System.in);

        //Prompt the user to enter 3 diameter values and then read the values from standard input
        System.out.println("Enter the 3 diameter values of the garden plots:");
        diameter1 = stdin.nextDouble();
        diameter2 = stdin.nextDouble();
        diameter3 = stdin.nextDouble();

        //Prompt the user to enter 2 price values and then read the values from standard input
        //INSERT THE CODE TO PROMPT THE USER FOR INPUT HERE
        System.out.println("Please enter 2 price values: ");
        //THEN USE THE SCANNER TO READ IN THE VALUES
        price1 = stdin.nextDouble();
        price2 = stdin.nextDouble();


        //calculate the circumference of each circle using the PI constant in the math library
        circumference1 = Math.PI * diameter1;
        circumference2 = Math.PI * diameter2;
        circumference3 = Math.PI * diameter3;

        //calculate the area of each circle using the PI constant and the pow() function
        //in the math library
        area1 = Math.PI * Math.pow((diameter1 / 2), 2);
        area2 = Math.PI * Math.pow((diameter2 / 2), 2);
        area3 = Math.PI * Math.pow((diameter3 / 2), 2);

        //display the column headings for the report
        System.out.println();
        System.out.println("Here is your cost comparison report:");
        System.out.println();
        //put line breaks in the middle of your long instructions to make them easier to read
        //see example below
        System.out.println("Circle   " + "Circumference   " +  " Cost of Material1    " +    "Cost of Material2  "  +   "    Area");
        System.out.format("A %20.2f %20.2f %20.2f %9.2f %n", circumference1, price1 = diameter1, price2 * diameter1, area1);
        System.out.format("B %20.2f %20.2f %20.2f %9.2f %n", circumference2, price1 = diameter2, price2 * diameter2, area2);
        System.out.format("C %20.2f %20.2f %20.2f %9.2f %n", circumference3, price1 = diameter3, price2 * diameter3, area3);


        //print a row that summarizes the values for each circle
        //ADD YOUR 3 STATEMENTS TO PRINT THE REPORT FOR EACH CIRCLE

// write your code here
    }
}
