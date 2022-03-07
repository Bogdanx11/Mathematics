package org.example.repetion;

import java.util.Scanner;

public class KarnovenHeathRate {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("What is your resting pulse ?");
        int restingPulse = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your age ?");
        int age = scanner.nextInt();
        scanner.nextLine();
        int intensity1 =55;

        System.out.println("Internsity    |   Rate");
        System.out.println("--------------|-------");
        for (int intensity = 55  ; intensity <= 95 ; intensity = intensity+5) {

            int TargetHeartRate = (((220 - age) - restingPulse) * (intensity/100)) + restingPulse;

            System.out.println(intensity     + "%           |   " +  TargetHeartRate + " bpm");
        }
    }
}
