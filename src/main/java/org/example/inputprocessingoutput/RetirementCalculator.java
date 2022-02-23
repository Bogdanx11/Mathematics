package org.example.inputprocessingoutput;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
        Scanner scanner = new Scanner(System.in);

        public void start() {
            System.out.println("What is you current age ?");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("At what age would you like to retire ? ");
            int retireAge = scanner.nextInt();
            scanner.nextLine();
            int yearsUntilRetire = retireAge - age;
            LocalDate Year = LocalDate.now();
            int retireYear = Year.getYear() + age;
            System.out.println("You have " + yearsUntilRetire + " left until you can retire");
            System.out.println("It's " + Year.getYear() + " ,so you can retire in " + retireYear);
        }
}
