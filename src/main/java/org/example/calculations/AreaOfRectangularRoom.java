package org.example.calculations;

import java.util.Scanner;

public class AreaOfRectangularRoom {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet ?");

        int flag=1;

       int length = scanner.nextInt();
       scanner.nextLine();

        System.out.println("What is the width of the room in feet ?");

        int width = scanner.nextInt();
        double feetToMeter = 0.09290304;

        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");
        double areafeet1 = length*width;
        double areameters1 = areafeet1 * feetToMeter;
        System.out.println("The area is ");
        System.out.println(areafeet1+" square feet ");
        System.out.println(areameters1+" square meters");

    }
}
