package org.lickingheights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String[] computerOptions = new String[3];
    static String computerChoice;
    static int playerChoice;
    static String choice;
    static Scanner keyboard = new Scanner(System.in);
    static boolean running=true;
    static Random rand = new Random();
  static int computerScore=0, playerScore=0;



    public static void start() {

        computerOptions[0] = "Rock";
        computerOptions[1] = "Paper";
        computerOptions[2] = "Scissors";
    }


    public static void main(String[] args) {
        start();
        System.out.println("Lets play Rock, Paper, and Scissors!");
        while(running) {
            System.out.println("Type 1 for Rock");
            System.out.println("Type 2 for Paper");
            System.out.println("Type 3 for Scissors");
            playerChoice = keyboard.nextInt();
            computerChoice = computerOptions[rand.nextInt(3)];
            weapon();
            System.out.println("You chose "+ choice);
            System.out.println("Computer chose "+ computerChoice);
            score();
            System.out.println("Your score is "+playerScore);
            System.out.println("The computer's score is "+computerScore+"\n\n\n");

        }
    }

    public static String weapon(){
        if(playerChoice == 1){
            choice = "Rock";
        }else if(playerChoice == 2){
            choice = "Paper";
        }else if(playerChoice == 3){
            choice = "Scissors";
        }

        return choice;
    }
    public static void score(){
        if (playerChoice==1 && computerChoice.equalsIgnoreCase("Rock")){
            System.out.println("It is a tie!");
        }
        else if (playerChoice==1 && computerChoice.equalsIgnoreCase("Paper")){
            System.out.println("You lose!");
            computerScore++;
        }
        else if (playerChoice==1 && computerChoice.equalsIgnoreCase("Scissors")){
            System.out.println("You win!");
            playerScore++;
        }
        else if (playerChoice==2 && computerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("It's a tie!!");
        }
        else if (playerChoice==2 && computerChoice.equalsIgnoreCase("Rock")) {
            System.out.println("You win!");
            playerScore++;
        }
        else if (playerChoice==2 && computerChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("You lose!");
            computerScore++;
        }
        else if (playerChoice==3 && computerChoice.equalsIgnoreCase("Rock")) {
            System.out.println("You lose!");
            computerScore++;
        }
        else if (playerChoice==3 && computerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("You win!");
            playerScore++;
        }
        else if (playerChoice==3 && computerChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("It's a tie!");
        }
    }


}
