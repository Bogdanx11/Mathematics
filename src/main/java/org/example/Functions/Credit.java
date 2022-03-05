package org.example.Functions;

import java.util.Scanner;

public class Credit {

    public double start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your balance :");
        double balance = scanner.nextDouble();

        System.out.println("What is the APR on the card ?");
        double apr = scanner.nextDouble();
        apr = (apr * balance) / 100;
        double i = apr/365;
        System.out.println("What is the monthly payment you can make ?");
        double p = scanner.nextDouble();

        double n = (-1/30) * Math.log(1+((balance/p)*(1-(Math.pow(1+i,30)))));
        n = n / Math.log(1+i);
        return Math.ceil(n);
    }
}
