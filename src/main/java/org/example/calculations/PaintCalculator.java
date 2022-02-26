package org.example.calculations;

import java.util.Scanner;

public class PaintCalculator {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        System.out.println("What is the length? ");
        double length = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What is the width? ");
        double width = scanner.nextDouble();

        double area = length * width;

       int numberOfGallons = (int)Math.ceil(area/350);

        System.out.println("You will need to purchase "+numberOfGallons+" gallons of paint to cover "+area+" square feet.");
    }
}
