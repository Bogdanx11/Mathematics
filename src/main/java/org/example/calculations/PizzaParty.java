package org.example.calculations;

import java.util.Scanner;

public class PizzaParty {
    Scanner scanner = new Scanner(System.in);
    public void start(){

        System.out.println("How many people? ");
       int numberOfPeople = scanner.nextInt();
       scanner.nextLine();

        System.out.println("How many pizzas do you have ?");
        int numberOfPizzas = scanner.nextInt();

        int numberOfSlices = numberOfPizzas * 8;

        System.out.println(numberOfPeople+" people with "+numberOfPizzas+" pizzas");
        int slicesPerPerson = numberOfSlices / numberOfPeople;
        int leftOverSlices = numberOfSlices % numberOfPeople;

        if(slicesPerPerson>1) {

            System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza");
            System.out.println("There are " + leftOverSlices + " leftover pieces.");
        }
        else{
            System.out.println("Each person gets " + slicesPerPerson + " piece of pizza");
            System.out.println("There are " + leftOverSlices + " leftover pieces.");
        }
    }
}
