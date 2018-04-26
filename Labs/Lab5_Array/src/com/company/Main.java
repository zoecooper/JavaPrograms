package com.company;

//import statements

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //scanner

        Scanner stdin = new Scanner(System.in);

        //variable declarations

        int uniqueProducts;

        double avg_reg_price = 0;

        //prompt the user for unique items

        System.out.println("How many unique items are in stock?");
        uniqueProducts = stdin.nextInt();

        //Array declarations
        String[] products = new String[10];
        long[] upc_numbers = new long[10];
        double[] prices = new double[10];
        boolean[] onSaleyesorno = new boolean[10];

        //correct number?

        if (uniqueProducts <= 10) {
            System.out.println("Correct Number of Products");


            //prompting the user for info on products
            //
            for (int i = 0; i < uniqueProducts; i++) {
                System.out.println("Enter the product name, UPC, price, and boolean representing sale:");
                products[i] = stdin.next();
                upc_numbers[i] = stdin.nextLong();
                prices[i] = stdin.nextDouble();
                onSaleyesorno[i] = stdin.nextBoolean();
            }

            double sum = 0.0;

            //avg price loop


            for (int i = 0; i < prices.length; i++) {
                sum = sum + prices[i];
                avg_reg_price = sum / uniqueProducts;
            }

            System.out.println();
            System.out.println("The average regular price is: $ " + avg_reg_price);

            double max = prices[0];
            int positionOfMax = 0;

            //max price loop


            for (int counter = 1; counter < prices.length; counter++) {
                if (prices[counter] > max) {
                    max = prices[counter];
                    positionOfMax = counter;
                }
            }


            System.out.println();
            System.out.println("The most expensive item is: " + max);
            System.out.println("The product name of the most expensive item is: " + products[positionOfMax]);

            //inventory loop

            System.out.println();
            System.out.println("Inventory Report: ");
            System.out.println("Product Name   " + "UPC   " +  "          Price   ");

            for (int i = 0; i < uniqueProducts; ++i) {   //loop once for each unique product in the list
                System.out.format("%1s %22d %8.2f %n", products[i], upc_numbers[i], prices[i]);
            }
                // System.out.format("%1s %8d %17.2f %n", );
            // System.out.format("%1s %8d %%17.2f %n", );
            // System.out.format("%1s %8d %17.2f %n", );
            // System.out.println("");

            //search algorithm

            //for
            //    if i = num - 1 && ! found
            System.out.println();


            String continueYes = "Y";

            while (continueYes.equals("Y")){
                System.out.println("Which item would you like to search for?");
                String itemany = stdin.next();
                int index = -1;
                int position = 0;

                //loop to iterate through the array and find the item (or not)
                while (position < uniqueProducts) {
                    if (products[position].equals(itemany)) {
                        index = position;
                    }
                    ++position;
                }

                if (index == -1) {
                    System.out.println(itemany + " is not carried in the store. Would you like to search again?");
                }
                else {
                    System.out.println(itemany + " is carried in the store. Would you like to search again?");
                }

                //read the response to the question
                continueYes = stdin.next();

            }
        }//end of outside loop





        //wrong number of products entered, ending the program...


        else {
            System.out.println("Wrong Number of Products");
            System.out.println("End of Program");
        }


    }
}

