package org.example.dataStructures;

import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {
    Scanner scanner = new Scanner(System.in);


    public void start(){
        System.out.println("What is your question ?");

        String[] answers = {"Yes", "Maybe", "No", "Ask again later"};
        int randomNumber = ThreadLocalRandom.current().nextInt(1,4);

        scanner.nextLine();

        System.out.println(answers[randomNumber]);
    }
}
