package org.example.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("What is the first number ? ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the second number ? ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        int dif = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " +  sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " +  dif);
        System.out.println(firstNumber + " * " + secondNumber + " = " +  product);
        System.out.println(firstNumber + " / " + secondNumber + " = " +  quotient);
    }
}
