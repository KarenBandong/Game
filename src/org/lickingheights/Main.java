package org.lickingheights;

import java.util.Scanner;

public class Main {

    static String[] computerOptions = new String[3];
    static String computerChoice;
    static int playerChoice;
    static String choice;
    Scanner keyboard = new Scanner(System.in);
    static boolean running=true;



    public static void start() {

        computerOptions[0] = "Rock";
        computerOptions[1] = "Paper";
        computerOptions[2] = "Scissors";
    }


    public static void main(String[] args) {
        start();
        System.out.println("lets play rock, paper, scissors!");
        while(running) {
            System.out.println("Type 1 for Rock");
            System.out.println("Type 2 for Paper");
            System.out.println("Type 3 for Scissors");
        }
    }
}
