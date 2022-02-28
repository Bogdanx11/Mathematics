package org.example.makingDecisions;

import java.util.Scanner;

public class PasswordValidation {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("What is your username? ");
        scanner.nextLine();

        System.out.println("What is your password ?");
      String password = scanner.nextLine();


      String correctPassword = "abc123";

      if(correctPassword.equalsIgnoreCase(password)){
          System.out.println("Welcome!");
      }
      else{
          System.out.println("I don't know you!");
      }



    }
}
