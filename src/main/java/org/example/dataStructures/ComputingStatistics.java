package org.example.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        String done;
        String stop = "done";
        String responseTime;
        List<Integer> responsesTimeList = new ArrayList<>();
        do{
            System.out.println("Enter a number :");
            responseTime = scanner.nextLine();
            responsesTimeList.add(Integer.parseInt(responseTime));
            System.out.println("Are you done ?");
            done = scanner.nextLine();
        }while(!done.equalsIgnoreCase(stop));


        int sum = 0;
        int min = 999999999;
        int max = 0;
        System.out.print("Numbers : ");
        for(int i :responsesTimeList){
            System.out.println(i + ", ");
            sum = sum + i;

            if(i<min)
                min = i;
            if(i>max)
                max = i;


        }
        double average = (double)sum/responsesTimeList.size();
        double standardDeviation = Math.sqrt(average);
        System.out.println("The average is : " + average);
        System.out.println("The minimum is : " + min);
        System.out.println("The maximum is : "+ max);
        System.out.println("The standard deviation is "+ standardDeviation);

    }
}
