/**
 * This program is a text-based 'Choose your own adventure' game in which the user can manipulate the story's ending based on the choices
 * they make throughout the plot.
 * @author Zoe Cooper
 * @verson 1.0
 */


package com.company;

//import statements

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int stories = 0;

        //array of different stories

        ArrayList<Story> Stories = new ArrayList<Story>(stories);

        //introduction

        System.out.println("  ");
        System.out.println("*WELCOME TO ZOE'S HOUSE OF HORROR*");
        System.out.println("In this game, you will be presented situations and options in which you may create the ending to the story.");
        System.out.println("If you do not like horror, this game is not for you...continue at your discretion. Type 'yes' to continue.");
        System.out.print("> ");
        String toContinue = "";
        toContinue = scnr.next();
        boolean willPlay = true;

        String link = "";
        String story = "";

        //different stories

        Story situation1 = new Story(link, story);
        Story situation2 = new Story(link, story);
        Story situation3 = new Story(link, story);
        Story situation4 = new Story(link, story);
        Story situation5 = new Story(link, story);
        Story situation6 = new Story(link, story);

        //will they even play?

        while(willPlay) { //while loop
            if(toContinue.equals("yes")) {
                System.out.println("You were walking in the woods at night and came across a creepy house! You were feeling adventurous and decided to go explore and whilst standing inside the foyer gazing, you hear the door open again behind you...someone else has just come in! Is it the killer ? You must run!!! Would you like to go 'upstairs' or into the 'kitchen'?");
                System.out.print("> ");
                situation1.setLink(scnr.next());
            }
            willPlay = false; //turns willPlay to false
        }


       if (toContinue.equals("no")) { //if they do not want to play
           System.out.println("Guess you're too scared to play!");
           System.out.println("Catch you next time!");
           System.out.println("End of game.");
           willPlay = false;
        }

        //    System.out.println("You were walking in the woods at night and came across a creepy house! You were feeling adventurous and decided to go explore and whilst standing inside the foyer gazing, you hear the door open again behind you...someone else has just come in! Is it the killer ? You must run!!! Would you like to go 'upstairs' or into the 'kitchen'?");
        //    System.out.print("> ");
        //    situation1.setLink(scnr.next());
      // }

        //if they type anything else, makes it so it won't play
        //else {
        //    System.out.println("Guess you're too scared to play!");
        //    System.out.println("Catch you next time!");
       //     System.out.println("End of game.");

       // }

        //did they choose upstairs or kitchen? (what did the user pick?)
        if(situation1.getLink().equals("upstairs")){ //gets their response and checks if their response equals something
            situation1.setStory("You're panting from running that huge flight of steps, but quickly see a bedroom to your left. Upon entering, you see a bed and a closet. Do you hide under the 'bed' or in the 'closet'?");
            System.out.println(situation1.getStory());
            System.out.print("> ");
            situation2.setLink(scnr.next());
        }


        if(situation1.getLink().equals("kitchen")){
            situation1.setStory("POLTERGEIST! The plates in the sink start flying at you! How do you combat these plates? A: Steal the knife from the table next you and slice them 'fruit ninja' style. B: Duck and hope for the best. Type 'A' or 'B' into the console.");
            System.out.println(situation1.getStory());
            System.out.print("> ");
            situation5.setLink(scnr.next());
        }


        if(situation2.getLink().equals("bed")){
            situation2.setStory("Famous clown and Stephen King's creation, IT, is too, under the bed. He smiles and then stabs you in the back.");
            System.out.println(situation2.getStory());
            System.out.println("You're dead.");
            System.out.println("End of game.");
        }

        if(situation2.getLink().equals("closet")){
            situation2.setStory("You estimate it has been about fifteen minutes since you entered the closet. You are getting antsy. You peek through the sliver of the closet and notice there is a window open on the opposite side of the bedroom. You also remember you passed a bathroom on the way to the bedroom. Do you want to make a break for it, sprint to the window, and jump out OR run to the bathroom? Type 'window' or 'bathroom'.");
            System.out.println(situation2.getStory());
            System.out.print("> ");
            situation3.setLink(scnr.next());
        }

        if(situation3.getLink().equals("window")){
            situation3.setStory("You jump out the window and run as fast as you can into the woods. You do not hear anything following you and you make it back safe to your house. Yay!");
            System.out.println(situation3.getStory());
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if(situation3.getLink().equals("bathroom")){
            situation3.setStory("Congratulations! You've made miss Bloody Mary upset as she HATES intruders. She screams through the mirror: 'If you do not leave within THREE SECONDS, I will kill you!' So... A: RUN! or B: Honestly, give up. Type A or B.");
            System.out.println(situation3.getStory());
            System.out.print("> ");
            situation4.setLink(scnr.next());
        }

        if(situation4.getLink().equals("A")){
            situation4.setStory("You run out and back down the steps before the killer sees you, you run back to your place safely and lock your doors.");
            System.out.println(situation4.getStory());
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if(situation4.getLink().equals("B")){
            situation4.setStory("You've given up. You lay on the floor awaiting Bloody Mary's attack.");
            System.out.println(situation4.getStory());
            System.out.println();
            System.out.println("But wait!!! As Bloody Mary goes in for the kill, the magic and all-powerful love of Lilly Potter spares you from the kiss of death.");
            System.out.println("Her ghost takes you on her broomstick back safely to your home.");
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if(situation5.getLink().equals("A")){
            situation5.setStory("When going for the knife, you grasped it wrong and cut yourself deep. You bleed out.");
            System.out.println(situation5.getStory());
            System.out.println("You're dead.");
            System.out.println("End of game.");
        }

        if(situation5.getLink().equals("B")){
            situation5.setStory("You duck down but during this time the killer has approached you. He asks you if you have any last words. Do you say 'yes' or 'no'?");
            System.out.println(situation5.getStory());
            System.out.print("> ");
            situation6.setLink(scnr.next());
        }

        if(situation6.getLink().equals("yes")){
            situation6.setStory("Right before you speak, Thor smashes through the window, grasps you and takes you back to Asgard. Congrats you're now a Viking God.");
            System.out.println(situation6.getStory());
            System.out.println("You made it out alive!");
            System.out.println("End of game.");
        }

        if(situation6.getLink().equals("no")){
            situation6.setStory("The killer kills you.");
            System.out.println(situation6.getStory());
            System.out.println("You're dead.");
            System.out.println("End of game.");
        }

        //add stories †ø array
        Stories.add(situation1);
        Stories.add(situation2);
        Stories.add(situation3);
        Stories.add(situation4);
        Stories.add(situation5);
        Stories.add(situation6);

        String testString;
        String type;

        //try catch
        if(situation4.getLink().equals("a") || situation4.getLink().equals("b")) {
            try {
                situation4.getLink().equals("a"); //if the user does not capitalize the letter 'A' or 'B' like the instructions ask for
                situation4.getLink().equals("b");
            } catch (Exception e) {
                System.err.println(e);
                System.err.println("Invalid user input. Please capitalize the letter.");
            }
            //if the user does not capitalize the letter 'A' or 'B' like the instructions ask for
            finally {
                System.err.println("Invalid user input.");
            }
        }


       //     situation1.getLink().contains(" "); //they would be trying to write more than one word and only one word is allowed
       // catch (IndexOutOfBoundsException e) {
       //     System.out.println(e + "User input error: You cannot put more than one word in as your choice.");
      //  }


       // if(situation4.getLink().equals("a")){
        //    try{
         //       boolean doesIt = situation4.getLink().equals("a");
         //   }
         //   catch (Exception e) {
         //       System.err.println(e);
         //       System.err.println("Invalid user input. Please capitalize the letter.");
         //   }

        //}


      //  try {
      //      situation4.getLink().equals("b");
      //  } catch (Error e) {
       //     System.err.println(e);
        //    System.err.println("Invalid user input. Please capitalize the letter."); }


        //for (int count = 0; count < Stories.size(); ++count) {
        //    System.out.println(count);
        //}

       // for(int i = 0; i < Stories.size(); i++){
       //     if (situation1.getLink().equals("upstairs") && (situation2.getLink().equals("bed"))){
       //         System.out.println("You made one right choice before you died.");
       //     }
       // }

        //while(situation1.getLink().equals("upstairs")) {
         //   if (situation2.getLink().equals("bed")) {
         //       System.out.println("You made one right choice before you died");
         //   }
       // }




    }
}
