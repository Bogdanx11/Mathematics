package org.example.Functions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PasswordStrength {

    public void start(String password){
        boolean hasDigit = false;
        boolean specialCharacters = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        int length = password.length();

        Set<Character> set= new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^','&', '*', '(', ')', '-', '=', '/', ';', ':','\"', '?', '<','>')
        );

        for(char i : password.toCharArray()){
            if(Character.isLowerCase(i)){
                hasLower = true;
            }

            if(Character.isUpperCase(i)) {
                hasUpper = true;

            }
                if(Character.isDigit(i)){
                    hasDigit = true;
                }

                if(set.contains(i)){
                    specialCharacters = true;
                }

        }

        if((hasUpper || hasLower) && hasDigit && specialCharacters && length>=8)
            System.out.println("Very strong password");

        if((hasUpper || hasLower) && hasDigit && length>=8 && !specialCharacters)
            System.out.println("Strong password");

        if((hasLower || hasUpper) && length<8)
            System.out.println("Weak password");

        if(hasDigit && length<8)
            System.out.println("Very weak password");

    }
}
