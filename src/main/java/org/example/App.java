package org.example;

import org.example.Functions.AnagramChecker;
import org.example.Functions.Credit;
import org.example.Functions.PasswordStrength;
import org.example.Functions.ValidatingInouts;
import org.example.calculations.AreaOfRectangularRoom;
import org.example.calculations.PaintCalculator;
import org.example.calculations.PizzaParty;
import org.example.calculations.SelfCheckout;
import org.example.makingDecisions.LegalDrivingAge;
import org.example.makingDecisions.NumbersToNames;
import org.example.makingDecisions.PasswordValidation;
import org.example.makingDecisions.TaxCalculator;
import org.example.repetion.*;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
        Suma calcule = new Suma();
        int a = 10;
        int b = 5;

        double c = 3.4;
        double d = 4.5;

        int sumInt = calcule.suma(a,b);
        int productInt = calcule.produs(a,b);

        double sumDouble = calcule.suma(c,d);
        double productDouble = calcule.produs(c,d);


        System.out.println("Integer sum :"+sumInt);
        System.out.println("Integer product :"+productInt);

        System.out.println("Double sum :"+sumDouble);
        System.out.println("Double product :"+productDouble);


      /**  //exercise1
        SayingHello hello1 = new SayingHello();
        hello1.start1();
       */

     /**   //exercise2
        CountingTheNumbersOfCharacters counting1 = new CountingTheNumbersOfCharacters();
        counting1.start();
    */

     /** //exercise3
      *  PrintingQuotes print1 = new PrintingQuotes();
        print1.start();
      */

   /**  //exercise4
        MadLib mad1 = new MadLib();
        mad1.start();
    */

    /**  //exercise5
        SimpleMath math1 = new SimpleMath();
        math1.start();

     //exercise6
     */
 /**   RetirementCalculator retired =new RetirementCalculator();
    retired.start();
  */


   /** //exercise7


        AreaOfRectangularRoom area = new AreaOfRectangularRoom();
        area.start();
    */

   /**
   //exercise8
        PizzaParty pizza = new PizzaParty();
        pizza.start();
*/

   /**
   //exercise9
        PaintCalculator paint = new PaintCalculator();
        paint.start();
    */
/**
   //exercise10
        SelfCheckout self = new SelfCheckout();
        self.start();
*/
/**
//exercise 14
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.start();

 */
/**
//exercise 15
        PasswordValidation password = new PasswordValidation();
        password.start();
*/

/**
//exercise 16
        LegalDrivingAge legalDrivingAge = new LegalDrivingAge();
        legalDrivingAge.start();

 */
/**
//exercise 21
        NumbersToNames months = new NumbersToNames();
        months.start();
 */

/**
//exercise 24
        AnagramChecker anagram = new AnagramChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("String 1 :");
       char[] string1 = scanner.next().toCharArray();
        System.out.println("String 2: ");
        char[] string2 = scanner.next().toCharArray();
       if( anagram.anagramChecking(string1,string2))
           System.out.println("They are anagrams");
       else
           System.out.println("They are not anagrams");

*/
/**
        PasswordStrength passwordStrength = new PasswordStrength();
        passwordStrength.start("1337H@xor");
 */

/**
        Credit credit = new Credit();
        System.out.println(credit.start());

 */

/**
        ValidatingInouts valid = new ValidatingInouts();
        valid.start();
 */
/**
//exercise 28
        AddingNumbers addingNumbers = new AddingNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to add ?");
        int n = scanner.nextInt();
        int sum = addingNumbers.start(n);
        System.out.println("Sum is :" + sum);
*/
/**
        //exercise 29
        HandlingBadInput handlingBadInput = new HandlingBadInput();
        handlingBadInput.start();
*/

/**
//exercise 30
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.start();
 */

/**
//exercise 31
        KarnovenHeathRate karnovenHeathRate = new KarnovenHeathRate();
        karnovenHeathRate.start();
 */

//exercise32
        GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
        guessTheNumberGame.start();

 }

}
