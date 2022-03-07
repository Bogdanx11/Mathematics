package org.example.dataStructures;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {
    Scanner scanner = new Scanner(System.in);
    public void start(){

        List<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Chris");
        employees.add("Joe");
        employees.add("Katy");
        employees.add("Michael");
        System.out.println("There are " + employees.size() + " employees :");
        for(String employee : employees){
            System.out.println(employee);
        }

        System.out.println("Enter an employee to remove :");
        String removedEmployee = scanner.nextLine();
        employees.remove(removedEmployee);

        System.out.println();
        System.out.println("There are " + employees.size() + " employees :");
        for(String employee : employees){
            System.out.println(employee);
        }

    }
}
