package org.example.repetion;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumberGame {
    Scanner scanner = new Scanner(System.in);
    public void start(){

        boolean hasNextAlphabetic;
        boolean hasNextInt;
        //repeat condition
        int repeat = 1;
        while (repeat == 1){
            repeat = 0;

            /** start */
        System.out.println("Let's play Guess the Number");


            int guesses = 1;


            /** verification of the input level */
        do{
            System.out.println("Pick a difficulty level (1, 2 or 3) :");
            hasNextAlphabetic = scanner.hasNextLine();
          hasNextInt = scanner.hasNextInt();
          scanner.nextLine();

          if(hasNextAlphabetic && !hasNextInt)
            System.out.println("It must be a number between 1-3 . Please pick again!");

          if(hasNextInt)
              System.out.println("Are you sure ? Type again if yes.");


        }while(hasNextAlphabetic && !hasNextInt);

                int difficultyLevel = scanner.nextInt();
                scanner.nextLine();




                /**level1*/

                if (difficultyLevel == 1) {
                    int myNumber = ThreadLocalRandom.current().nextInt(1, 10);
                    System.out.println(" ** Level 1 (Numbers between 1-10) **");
                    System.out.println("I have my number. What is your guess? ");


                    int yourNumber = scanner.nextInt();
                    while (yourNumber != myNumber) {

                        if (yourNumber > myNumber) {
                            System.out.println("Too high. Guess again :");
                            yourNumber = scanner.nextInt();
                            scanner.nextLine();
                            guesses++;
                        } else if (yourNumber < myNumber) {
                            System.out.println("Too low. Guess again :");
                            yourNumber = scanner.nextInt();
                            scanner.nextLine();
                            guesses++;
                        }
                    }

                    if (yourNumber == myNumber) {
                        System.out.println("Great ! You got it in " + guesses + " guesses!");
                        System.out.println("Play again ? (yes or no) ");

                        String playAgain = scanner.nextLine();
                        if (playAgain.equalsIgnoreCase("no"))
                            System.out.println("Goodbye!");
                        else if (playAgain.equalsIgnoreCase("yes"))
                            repeat = 1;
                    }

                }


       /**level2*/
            if(difficultyLevel == 2)
            {
                int myNumber = ThreadLocalRandom.current().nextInt(1,20);
                System.out.println(" ** Level 2 (Numbers between 1-20) **");
                System.out.println("I have my number. What is your guess? ");
                int yourNumber = scanner.nextInt();
                while(yourNumber != myNumber){
                    if(yourNumber > myNumber) {
                        System.out.println("Too high. Guess again :");
                        yourNumber = scanner.nextInt();
                        scanner.nextLine();
                        guesses++;
                    }
                    else if(yourNumber < myNumber){
                        System.out.println("Too low. Guess again :");
                        yourNumber = scanner.nextInt();
                        scanner.nextLine();
                        guesses++;
                    }
                }

                if(yourNumber == myNumber){
                    System.out.println("Great ! You got it in "+ guesses + " guesses!");
                    System.out.println("Play again ? (yes or no) ");

                    String playAgain = scanner.nextLine();
                    if(playAgain.equalsIgnoreCase("no"))
                        System.out.println("Goodbye!");
                    else if(playAgain.equalsIgnoreCase("yes"))
                        repeat = 1;
                }

            }


            /**level3*/

            if(difficultyLevel == 3)
            {
                int myNumber = ThreadLocalRandom.current().nextInt(1,30);
                System.out.println(" ** Level 3 (Numbers between 1-30) **");
                System.out.println("I have my number. What is your guess? ");
                int yourNumber = scanner.nextInt();
                while(yourNumber != myNumber){
                    if(yourNumber > myNumber) {
                        System.out.println("Too high. Guess again :");
                        yourNumber = scanner.nextInt();
                        scanner.nextLine();
                        guesses++;
                    }
                    else if(yourNumber < myNumber){
                        System.out.println("Too low. Guess again :");
                        yourNumber = scanner.nextInt();
                        scanner.nextLine();
                        guesses++;
                    }
                }

                if(yourNumber == myNumber){
                    System.out.println("Great ! You got it in "+ guesses + " guesses!");
                    System.out.println("Play again ? (yes or no) ");

                    String playAgain = scanner.nextLine();
                    if(playAgain.equalsIgnoreCase("no"))
                        System.out.println("Goodbye!");
                    else if(playAgain.equalsIgnoreCase("yes"))
                        repeat = 1;
                }

            }




    }

}
}

