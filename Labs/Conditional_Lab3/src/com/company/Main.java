package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //variable declarations
        int exam1Grade;
        int exam2Grade;
        int exam3Grade;
        double averageGrade;

        //scanner
        Scanner stdin = new Scanner(System.in);

        //Prompt user
        System.out.println("Enter the grade you got on your first exam:");
        exam1Grade = stdin.nextInt();

        System.out.println("Enter the grade you got on your second exam:");
        exam2Grade = stdin.nextInt();

        System.out.println("Enter the grade you got on your third exam:");
        exam3Grade = stdin.nextInt();

        //equation
        averageGrade = (exam1Grade + exam2Grade + exam3Grade)/3;

        //if statements
        if (averageGrade < 60) {
            System.out.println("Failing");
        }
        if (averageGrade > 60 && averageGrade < 70) {
            System.out.println("Passing, but marginal");
        }
        if (averageGrade > 70 && averageGrade < 80) {
            System.out.println("Hang in there and work hard!");
        }
        if (averageGrade > 80 && averageGrade < 90) {
            System.out.println("Great work!");
        }
        if (averageGrade > 90 && averageGrade <= 100) {
            System.out.println("Excellent work!");// write your code here
        }
    }
}
