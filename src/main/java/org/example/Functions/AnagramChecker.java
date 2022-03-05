package org.example.Functions;

import java.util.Arrays;

public class AnagramChecker {
    public boolean anagramChecking(char[] string1, char[] string2){
        if(string1.length != string2.length){
            return false;
        }
        Arrays.sort(string1);
        Arrays.sort(string2);

        for(int i=0; i<string1.length; i++){
            if(string1[i] != string2[i])
                return false;

        }
        return true;
    }
}
