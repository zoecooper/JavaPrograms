/**
 * This program can calculate a student's GPA for 5 courses asking the user for input such as their class names,
 * the credits per course, and the grade they got per class. It also determines whether they were eligible for the
 * President's List or Dean's List based on their cumulative GPA or if they will be placed on academic probation for a lower
 * than usual GPA.
 * @author Zoe Cooper
 * @verson 1.0
 */



package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //Variable declarations

        String class_1;
        String class_2;
        String class_3;
        String class_4;
        String class_5;

        int class_1_creds;
        int class_2_creds;
        int class_3_creds;
        int class_4_creds;
        int class_5_creds;

        double quality_points1;
        double quality_points2;
        double quality_points3;
        double quality_points4;
        double quality_points5;

        String class_1_grade;
        String class_2_grade;
        String class_3_grade;
        String class_4_grade;
        String class_5_grade;

        double numGrade = 0;
        double numGrade1 = 0;
        double numGrade2 = 0;
        double numGrade3 = 0;
        double numGrade4 = 0;

        double totalqual_Points;
        int total_Creds;

        double gpa;

        //Instantiated a Scanner object here

        Scanner stdin = new Scanner(System.in);

        //Prompting the users for their class name

        System.out.println("Enter the name of the first class: ");
        class_1 = stdin.next();
        System.out.println("Enter the credits associated with: " + class_1);
        class_1_creds = stdin.nextInt();
        System.out.println("Enter the grade earned for: " + class_1);
        class_1_grade = stdin.next();

        System.out.println("Enter the name of the second class: ");
        class_2 = stdin.next();
        System.out.println("Enter the credits associated with: " + class_2);
        class_2_creds = stdin.nextInt();
        System.out.println("Enter the grade earned for: " + class_2);
        class_2_grade = stdin.next();

        System.out.println("Enter the name of the third class: ");
        class_3 = stdin.next();
        System.out.println("Enter the credits associated with: " + class_3);
        class_3_creds = stdin.nextInt();
        System.out.println("Enter the grade earned for: " + class_3);
        class_3_grade = stdin.next();

        System.out.println("Enter the name of the fourth class: ");
        class_4 = stdin.next();
        System.out.println("Enter the credits associated with: " + class_4);
        class_4_creds = stdin.nextInt();
        System.out.println("Enter the grade earned for: " + class_4);
        class_4_grade = stdin.next();

        System.out.println("Enter the name of the fifth class: ");
        class_5 = stdin.next();
        System.out.println("Enter the credits associated with: " + class_5);
        class_5_creds = stdin.nextInt();
        System.out.println("Enter the grade earned for: " + class_5);
        class_5_grade = stdin.next();

        //If Statements Class 1

        if (class_1_grade.equals("A")) {
            numGrade = 4.00;
        }
        else if (class_1_grade.equals("A-")) {
            numGrade = 3.70;
        }
        else if (class_1_grade.equals("B+")) {
            numGrade = 3.30;
        }
        else if (class_1_grade.equals("B")) {
            numGrade = 3.00;
        }
        else if (class_1_grade.equals("B-")) {
            numGrade = 2.70;
        }
        else if (class_1_grade.equals("C+")) {
            numGrade = 2.30;
        }
        else if (class_1_grade.equals("C")) {
            numGrade = 2.00;
        }
        else if (class_1_grade.equals("C-")) {
            numGrade = 1.70;
        }
        else if (class_1_grade.equals("D+")) {
            numGrade = 1.30;
        }
        else if (class_1_grade.equals("D")) {
            numGrade = 1.00;
        }
        else if (class_1_grade.equals("F")) {
            numGrade = 0.00;
        }

        //If Statements Class 2

        if (class_2_grade.equals("A")) {
            numGrade1 = 4.00;
        }
        else if (class_2_grade.equals("A-")) {
            numGrade1 = 3.70;
        }
        else if (class_2_grade.equals("B+")) {
            numGrade1 = 3.30;
        }
        else if (class_2_grade.equals("B")) {
            numGrade1 = 3.00;
        }
        else if (class_2_grade.equals("B-")) {
            numGrade1 = 2.70;
        }
        else if (class_2_grade.equals("C+")) {
            numGrade1 = 2.30;
        }
        else if (class_2_grade.equals("C")) {
            numGrade1 = 2.00;
        }
        else if (class_2_grade.equals("C-")) {
            numGrade1 = 1.70;
        }
        else if (class_2_grade.equals("D+")) {
            numGrade1 = 1.30;
        }
        else if (class_2_grade.equals("D")) {
            numGrade1 = 1.00;
        }
        else if (class_2_grade.equals("F")){
            numGrade1 = 0.00;
        }

        //If Statements Class 3

        if (class_3_grade.equals("A")) {
            numGrade2 = 4.00;
        }
        else if (class_3_grade.equals("A-")) {
            numGrade2 = 3.70;
        }
        else if (class_3_grade.equals("B+")) {
            numGrade2 = 3.30;
        }
        else if (class_3_grade.equals("B")) {
            numGrade2 = 3.00;
        }
        else if (class_3_grade.equals("B-")) {
            numGrade2 = 2.70;
        }
        else if (class_3_grade.equals("C+")) {
            numGrade2 = 2.30;
        }
        else if (class_3_grade.equals("C")) {
            numGrade2 = 2.00;
        }
        else if (class_3_grade.equals("C-")) {
            numGrade2 = 1.70;
        }
        else if (class_3_grade.equals("D+")) {
            numGrade2 = 1.30;
        }
        else if (class_3_grade.equals("D")) {
            numGrade2 = 1.00;
        }
        else if (class_3_grade.equals("F")){
            numGrade2 = 0.00;
        }

        //If Statements Class 4

        if (class_4_grade.equals("A")) {
            numGrade3 = 4.00;
        }
        else if (class_4_grade.equals("A-")) {
            numGrade3 = 3.70;
        }
        else if (class_4_grade.equals("B+")) {
            numGrade3 = 3.30;
        }
        else if (class_4_grade.equals("B")) {
            numGrade3 = 3.00;
        }
        else if (class_4_grade.equals("B-")) {
            numGrade3 = 2.70;
        }
        else if (class_4_grade.equals("C+")) {
            numGrade3 = 2.30;
        }
        else if (class_4_grade.equals("C")) {
            numGrade3 = 2.00;
        }
        else if (class_4_grade.equals("C-")) {
            numGrade3 = 1.70;
        }
        else if (class_4_grade.equals("D+")) {
            numGrade3 = 1.30;
        }
        else if (class_4_grade.equals("D")) {
            numGrade3 = 1.00;
        }
        else if (class_4_grade.equals("F")){
            numGrade3 = 0.00;
        }

        //If Statements Class 5

        if (class_5_grade.equals("A")) {
            numGrade4 = 4.00;
        }
        else if (class_5_grade.equals("A-")) {
            numGrade4 = 3.70;
        }
        else if (class_5_grade.equals("B+")) {
            numGrade4 = 3.30;
        }
        else if (class_5_grade.equals("B")) {
            numGrade4 = 3.00;
        }
        else if (class_5_grade.equals("B-")) {
            numGrade4 = 2.70;
        }
        else if (class_5_grade.equals("C+")) {
            numGrade4 = 2.30;
        }
        else if (class_5_grade.equals("C")) {
            numGrade4 = 2.00;
        }
        else if (class_5_grade.equals("C-")) {
            numGrade4 = 1.70;
        }
        else if (class_5_grade.equals("D+")) {
            numGrade4 = 1.30;
        }
        else if (class_5_grade.equals("D")) {
            numGrade4 = 1.00;
        }
        else if (class_5_grade.equals("F")){
            numGrade4 = 0.00;
        }

        //Equations

        quality_points1 = class_1_creds * numGrade;
        quality_points2 = class_2_creds * numGrade1;
        quality_points3 = class_3_creds * numGrade2;
        quality_points4 = class_4_creds * numGrade3;
        quality_points5 = class_5_creds * numGrade4;

        totalqual_Points = quality_points1 + quality_points2 + quality_points3 + quality_points4 + quality_points5;

        total_Creds = class_1_creds + class_2_creds + class_3_creds + class_4_creds + class_5_creds;

        gpa = (totalqual_Points / total_Creds);

        //Format printing their transcript and G.P.A.


        System.out.println();
        System.out.println("Your transcript report: ");
        System.out.println("Course   " + "Credits   " +  " Grade    " +    "Quality Points  ");
        System.out.format("%1s %8d %8.2s %17.2f %n", class_1, class_1_creds, class_1_grade, quality_points1);
        System.out.format("%1s %8d %8.2s %17.2f %n", class_2, class_2_creds, class_2_grade, quality_points2);
        System.out.format("%1s %8d %8.2s %17.2f %n", class_3, class_3_creds, class_3_grade, quality_points3);
        System.out.format("%1s %8d %8.2s %17.2f %n", class_4, class_4_creds, class_4_grade, quality_points4);
        System.out.format("%1s %8d %8.2s %17.2f %n", class_5, class_5_creds, class_5_grade, quality_points5);
        System.out.println("Your GPA is: " + gpa);

        //Determining if they made it on a list


        if (gpa > 3.50 && gpa < 4.0) {
            System.out.println("You made the Dean's list!");
        }

        else if (gpa == 4.00) {
            System.out.println("You made the President's List!");
        }
        else if (gpa < 2.00) {
            System.out.println("You will be placed on academic probation.");
        }

    }
}
