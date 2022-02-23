package org.example.inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumbersOfCharacters {

    Scanner scanner = new Scanner(System.in);

    public void start(){

        System.out.println("What is the input string ? ");
        String word = scanner.nextLine();
        int length = word.length();
        if(length == 0)
            System.out.println("You must enter something");
        else
        System.out.println(word + " has " + length + " characters.");
    }
}
