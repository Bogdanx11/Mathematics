package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Suma numere = new Suma();
        numere.a = 3;
        numere.b = 4;
        int c = numere.suma(numere.a, numere.b);
        int produs = numere.produs(numere.a, numere.b);
        System.out.println( "Hello World!" );
        System.out.println("Suma este " + c);
        System.out.println("Produsul este " + produs);
    }
}
