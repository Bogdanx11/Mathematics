package org.example.inputprocessingoutput;

import java.util.Scanner;

public class MadLib {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Enter a noun : ");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb : ");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective : ");
        String adjective = scanner.nextLine();
        System.out.println("Enter an adverb : ");
        String adverb = scanner.nextLine();
        System.out.println(noun+" "+verb +" "+adjective + " "+ adverb + ". That's hilarious!");
    }
}
