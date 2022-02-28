package org.example.makingDecisions;

import java.util.Scanner;

public class TaxCalculator {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("What is the order amount ?");
        int orderAmount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the state? ");
        String state = scanner.nextLine();

       String state1 ="WI";
       String state2 = "MN";
        if(state.equalsIgnoreCase(state1) || state.equalsIgnoreCase("Wisconsin") ){
            int subtotal = orderAmount;
            double tax = (5.5 * subtotal) / 100;
            double total = tax + subtotal;
            System.out.println("Subtotal : " + subtotal);
            System.out.println("Tax : " + tax);
            System.out.println("Total : " + total);
        }
        else if(state.equalsIgnoreCase(state2) || state.equalsIgnoreCase("Manhattan")){
            System.out.println("The total is "+ orderAmount);
        }


    }
}
