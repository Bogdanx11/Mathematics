package org.example.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PickingAWinner {

    Scanner scanner = new Scanner(System.in);
    public void start(){

        String contestant;

        List<String> contestants = new ArrayList<>();
        do{
            System.out.println("Enter a name :");
            contestant = scanner.nextLine();
         contestants.add(contestant);

        } while(contestant.length() != 0 );

       int sizeList = contestants.size();
       int randomWinner =  ThreadLocalRandom.current().nextInt(0,sizeList);

        System.out.println("The winner is "+ contestants.get(randomWinner));
    }
}
