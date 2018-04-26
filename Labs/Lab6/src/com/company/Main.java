package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> coursenameList = new ArrayList<String>();
        ArrayList<Integer> creditList = new ArrayList<Integer >();
        ArrayList<String> gradeList = new ArrayList<String>();
        ArrayList<Double> qualitypointList = new ArrayList<Double>();

        double[] numGrades = new double[11];

        String coursename;
        int credit = 0;
        String grade;

        double gpa = 0.0;



        String choice = "Y";

        Scanner stdin = new Scanner(System.in);


        while (choice.equals("Y")) {
            System.out.println("Enter the data for one course: ");
            coursename = stdin.next();
            coursenameList.add(coursename);
            credit = stdin.nextInt();
            creditList.add(credit);
            grade = stdin.next();
            gradeList.add(grade);
            System.out.println("Would you like to enter another course?");
            choice = stdin.next();
        }

        for(int i = 0; i < gradeList.size(); i++) {
            if ((gradeList.get(i)).equals("A")) {
                numGrades[i] = 4.00;
            }
            else if ((gradeList.get(i)).equals("A-")) {
                numGrades[i] = 3.70;
            }
            else if ((gradeList.get(i)).equals("B+")) {
                numGrades[i] = 3.30;
            }
            else if ((gradeList.get(i)).equals("B")) {
                numGrades[i] = 3.00;
            }
            else if ((gradeList.get(i)).equals("B-")) {
                numGrades[i] = 2.70;
            }
            else if ((gradeList.get(i)).equals("C+")) {
                numGrades[i] = 2.30;
            }
            else if ((gradeList.get(i)).equals("C")) {
                numGrades[i] = 2.00;
            }
            else if ((gradeList.get(i)).equals("C-")) {
                numGrades[i] = 1.70;
            }
            else if ((gradeList.get(i)).equals("D+")) {
                numGrades[i] = 1.30;
            }
            else if ((gradeList.get(i)).equals("D")) {
                numGrades[i] = 1.00;
            }
            else if ((gradeList.get(i)).equals("F")) {
                numGrades[i] = 0.00;
            }
        }





        for(int i = 0; i < gradeList.size(); i++) {
            double qualityPoint = creditList.get(i) * numGrades[i];
            qualitypointList.add(qualityPoint);
        }

        double totalqualityPoints = 0.0;

        for(int i = 0; i < qualitypointList.size(); i++) {
            totalqualityPoints += qualitypointList.get(i);
        }

        int totalCreds = 0;
        for(int i = 0; i < creditList.size(); i++) {
            totalCreds += creditList.get(i);
        }

        gpa = (totalqualityPoints / totalCreds);

        System.out.println();
        System.out.println("Your transcript report: ");
        System.out.println("Course   " + "Credits   " +  " Grade    " +    "Quality Points  ");
        for (int i = 0; i < coursenameList.size(); ++i) {   //loop once for each
            System.out.format("%1s %8d %8.2s %17.2f %n", coursenameList.get(i), creditList.get(i), gradeList.get(i), qualitypointList.get(i));
        }

        System.out.println();

        System.out.println("Your GPA is: " + gpa);

        //int index = -1;
        //int position = 0;

        for(int i = 0; i < gradeList.size(); i++) {
            if ((gradeList.get(i)).equals("D+")) {
                System.out.println("You should make an appointment with Academic Services.");
            } else if ((gradeList.get(i)).equals("D")) {
                System.out.println("You should make an appointment with Academic Services.");
            } else if ((gradeList.get(i)).equals("F")) {
                System.out.println("You should make an appointment with Academic Services.");
            }
        }

        //for (int i = 0; i < gradeList.size(); i++) {
         //   while (position < gradeList.size()) {
         //       if (gradeList.get(i).equals("D+")) {
         //           index = position;
          //      }
         //       ++position;
          //      if (gradeList.get(position).equals("D")) {
          //          index = position;
          //      }
          //      ++position;
           //     if (gradeList.get(position).equals("F")) {
           //         index = position;
           //     }
           //     ++position;
          //  }
        //}

       // if (index == -1) {
        //    System.out.println("You should make an appointment with Academic Services.");
        //}











    }
}
