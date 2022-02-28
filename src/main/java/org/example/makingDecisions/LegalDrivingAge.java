package org.example.makingDecisions;

import java.util.Scanner;

public class LegalDrivingAge {
    Scanner scanner = new Scanner(System.in);

    public void start(){

        System.out.println("What is your age ?");
        int age = scanner.nextInt();
        scanner.nextLine();


        if(age<16){
            System.out.println("You are not old enough to legally drive.");
        }
        else{
            System.out.println("You are old enough to legally drive.");
        }
    }
}
