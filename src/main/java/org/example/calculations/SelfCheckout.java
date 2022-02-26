package org.example.calculations;

import java.util.Scanner;

public class SelfCheckout {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("Enter the price of item 1 : ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the quantity of item1 :");
        int quantity1 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter the price of item 2 : ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the quantity of item1 :");
        int quantity2 = scanner.nextInt();
        scanner.nextLine();



        System.out.println("Enter the price of item 3 : ");
        double price3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the quantity of item1 :");
        int quantity3 = scanner.nextInt();
        scanner.nextLine();

        double subtotal = price1 + price2 + price3;

        double tax = (5.5 * subtotal) / 100;

        double total = subtotal + tax;
        System.out.println("Subtotal : " + subtotal);
        System.out.println("Tax : " + tax);
        System.out.println("Total : " + total);
    }
}
