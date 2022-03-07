package org.example.repetion;

import java.util.Scanner;

public class AddingNumbers {

    Scanner scanner = new Scanner(System.in);
    public int start(int n){
        int sum = 0;
        while(n !=0){
            System.out.println("Enter a number :");
           int number =  scanner.nextInt();
           scanner.nextLine();
           sum = sum + number;
           n--;

        }
        return sum;
    }
}
