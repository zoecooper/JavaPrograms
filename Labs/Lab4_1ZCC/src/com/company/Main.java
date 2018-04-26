package com.company;


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{



        int score;
        int totalScore = 0;
        int numScores = 0;
        double averageScore = 0;

        File inputFile = new File("input.txt");
        Scanner fileIn = new Scanner(inputFile);


        System.out.println("Please enter the quiz scores followed by a -1: ");
        while (fileIn.hasNext()){
            score = fileIn.nextInt();
            totalScore = totalScore + score;
            ++ numScores;
        }

        averageScore = (double) totalScore / numScores;

        System.out.println("The average score is: " + averageScore);





        // write your code here
    }
}
