package org.example.inputprocessingoutput;

import java.util.Scanner;

public class SayingHello {

    Scanner scanner = new Scanner(System.in);

    public void start1(){
        System.out.println("What is your name ? ");
        System.out.println("Hello, " + scanner.nextLine() + " nice to meet you!");
    }



}
