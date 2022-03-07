package org.example.repetion;

import java.util.Scanner;

public class HandlingBadInput {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        boolean hasNext0;
        boolean hasNextAlphabetic;
        boolean hasNextInt;
        do {
            System.out.println("What is the rate of return :");
             hasNext0 = scanner.hasNext("0");
             hasNextAlphabetic = scanner.hasNext();
           hasNextInt = scanner.hasNextInt();
            scanner.nextLine();
        } while(hasNext0 || (hasNextAlphabetic && hasNextInt) );



        int rateOfReturn = scanner.nextInt();

        if(rateOfReturn>0) {

            int years = (int) Math.ceil(72 / rateOfReturn);
            System.out.println("It will take " + years + " years to double your investment.");
        }





        }
    }

