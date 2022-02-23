package org.example.inputprocessingoutput;

import java.util.Scanner;

public class PrintingQuotes {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("What is the quote ? ");
        String quote = scanner.nextLine();
        System.out.println("Who said it ? ");
        String author = scanner.nextLine();
        System.out.println(author + " says, \" " + quote + "\"");
    }
}
