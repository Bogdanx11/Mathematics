package org.example.makingDecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Is the car silent when you turn the key ?");
       String response1 = scanner.nextLine();
       if(response1.equalsIgnoreCase("yes")){
           System.out.println("Are the battery terminals corroded ?");
           String response2 = scanner.nextLine();

       }
    }
}
