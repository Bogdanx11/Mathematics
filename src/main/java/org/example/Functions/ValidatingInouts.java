package org.example.Functions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.*;

public class ValidatingInouts {
    public void start(){

        Set<Character> set= new HashSet<>(Arrays.asList('-'));
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the first name :");
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name :");
        String lastName = scanner.nextLine();

        System.out.println("Enter the ZIP code :");
        boolean hasAlphabetic = false;
        boolean hasDigit = false;
        String Zip = scanner.nextLine();

        System.out.println("Enter an employee ID :");
        String id = scanner.nextLine();

        if(firstName.equalsIgnoreCase(""))
            System.out.println("The first name must be filled in ");
        else if(firstName.length()<2 )
            System.out.println(firstName + " is not a valid first name. It is too short");


        if(lastName.equalsIgnoreCase(""))
            System.out.println("Last name must be filled in.");

        else if(lastName.length()<2 )
            System.out.println(lastName + " is not a valid last name. It is too short");


        for(char i :Zip.toCharArray()){

            if(Character.isAlphabetic(i))
                hasAlphabetic = true;
        }

        if(hasAlphabetic)
            System.out.println("The ZIP code must be numeric");
        String regex = "^([A-Z]{2} [\s-]{1} d{4})$";
        Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(id);
       if(m.matches())
           System.out.println("The id is valid");
    }

}
