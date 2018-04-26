package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //Instantiate the scanner

        Scanner stdin = new Scanner(System.in);

        Random numberGenerator = new Random();

        //Variable declarations

        int count;
        int count1;

        int pick3;
        int pick4;
        int pick6;

        int numPeople;



        //Prompt user for # of people

        System.out.println("Give the number of people whom lottery numbers should be generated: ");
        numPeople = stdin.nextInt();
        System.out.println("Your lucky lottery numbers of the day are: ");
        count = 0;

        //Loops
        System.out.println("Pick 3         Pick 4             Pick 6");

        while (count < numPeople) {
            count1 = 0;
            while(count1 < 3){
                pick3 = numberGenerator.nextInt(9);
                System.out.print(pick3 + "   ");
                count1++;
            }
            System.out.print("   ");
            count1 = 0;
            while(count1 < 4){
                pick4 = numberGenerator.nextInt(9);
                System.out.print(pick4 + "   ");
                count1++;
            }
            System.out.print("   ");
            count1 = 0;
            while(count1 < 6){
                pick6 = numberGenerator.nextInt(9);
                System.out.print(pick6 + "   ");
                count1++;
            }

            System.out.println("");
            count++;
        }



        //while (count < 3) {
         //   System.out.println("Enter the student name");
          //  String name = stdin.next();

         //   for (int i = 0; i < name.length(); i++) {
         //       System.out.print(name.charAt(i) + " ** ");
         //   }
            //end for
           // System.out.println();
          //  count = count + 1;
       // }//end while

    }
}
