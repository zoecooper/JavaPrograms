package com.company;

import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        String whereTo = "";
        String whereToHide = "";
        String howToFightPlates = "";
        String whereToRun = "";
        String whatToDoNow = "";
        String anyLastWords = "";
        String willPlay = "";

        System.out.println("  ");
        System.out.println("*WELCOME TO ZOE'S HOUSE OF HORROR*");
        System.out.println("In this game, you will be presented situations and options in which you may create the ending to the story.");
        System.out.println("If you do not like horror, this game is not for you...continue at your discretion. Type 'yes' to continue.");
        System.out.print("> ");
        willPlay = scnr.next();


        if (willPlay.equals("yes")) {
            System.out.println("You were walking in the woods at night and came across a creepy house! You were feeling adventurous and decided to go explore and whilst standing inside the foyer gazing, you hear the door open again behind you...someone else has just come in! Is it the killer ? You must run!!! Would you like to go 'upstairs' or into the 'kitchen'?");
            System.out.print("> ");
            whereTo = scnr.next();
        }

        if (whereTo.equals("upstairs")) {
            System.out.println("You're panting from running that huge flight of steps, but quickly see a bedroom to your left. Upon entering, you see a bed and a closet. Do you hide under the 'bed' or in the 'closet'?");
            System.out.print("> ");
            whereToHide = scnr.next();
        }

        if (whereToHide.equals("bed")) {
            System.out.println("Famous clown and Stephen King's creation, IT, is too, under the bed. He smiles and then stabs you in the back.");
            System.out.println("You're dead.");
            System.out.println("End of game.");
        }

        if (whereToHide.equals("closet")) {
            System.out.println("You estimate it has been about fifteen minutes since you entered the closet. You are getting antsy. You peek through the sliver of the closet and notice there is a window open on the opposite side of the bedroom. You also remember you passed a bathroom on the way to the bedroom. Do you want to make a break for it, sprint to the window, and jump out OR run to the bathroom? Type 'window' or 'bathroom'.");
            System.out.print("> ");
            whereToRun = scnr.next();
        }

        if (whereToRun.equals("window")) {
            System.out.println("You jump out the window and run as fast as you can into the woods. You do not hear anything following you and you make it back safe to your house. Yay!");
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if (whereToRun.equals("bathroom")) {
            System.out.println("Congratulations! You've made miss Bloody Mary upset as she HATES intruders. She screams through the mirror: 'If you do not leave within THREE SECONDS, I will kill you!' So... A: RUN! or B: Honestly, give up. Type A or B.");
            System.out.print("> ");
            whatToDoNow = scnr.next();
        }

        if (whatToDoNow.equals("A")) {
            System.out.println("You run out and back down the steps before the killer sees you, you run back to your place safely and lock your doors.");
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if (whatToDoNow.equals("B")) {
            System.out.println("You've given up. You lay on the floor awaiting Bloody Mary's attack.");
            System.out.println("But wait!!! As Bloody Mary goes in for the kill, the magic and all-powerful love of Lilly Potter spares you from the kiss of death.");
            System.out.println("Her ghost takes you on her broomstick back safely to your home.");
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if (whereTo.equals("kitchen")) {
            System.out.println("POLTERGEIST! The plates in the sink start flying at you! How do you combat these plates? A: Steal the knife from the table next you and slice them 'fruit ninja' style. B: Duck and hope for the best. Type 'A' or 'B' into the console.");
            System.out.print("> ");
            howToFightPlates = scnr.next();
        }

        if (howToFightPlates.equals("A")) {
            System.out.println("When going for the knife, you grasped it wrong and cut yourself deep. You bleed out.");
            System.out.println("You're dead.");
            System.out.println("End of game.");
        }

        if (howToFightPlates.equals("B")) {
            System.out.println("You duck down but during this time the killer has approached you. He asks you if you have any last words. Do you say 'yes' or 'no'?");
            System.out.print("> ");
            anyLastWords = scnr.next();
        }

        if (anyLastWords.equals("yes")) {
            System.out.println("Right before you speak, Thor smashes through the window, grasps you and takes you back to Asgard. Congrats you're now a Viking God.");
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if (anyLastWords.equals("no")) {
            System.out.println("The killer kills you");
            System.out.println("You're dead.");
            System.out.println("End of game.");
        }

        try {

        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }

            //if (Eat.equalsIgnoreCase("Yes"))
            // {System.out.println("  ");
            //    System.out.println("You live!");}

            //else if (Eat.equalsIgnoreCase("No"))
            // {System.out.println("  ");
            //    System.out.println("You die of starvation!");}


            //    else if (Look.equalsIgnoreCase( "pantry" ))
            // {System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");}

        }


    }
