package Cvic5;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class PrikladyFunkce {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);
    static int cislo;

    public static void main(String[] args) {
        vystup.println("Zadej n = ");
        int n = vstup.nextInt();

        // Here we call the sum method and print the result
        vystup.printf("Soucet prvnich %d cisel je %d\n", n, soucetN(n));
    }

    // This method calculates the sum of numbers from 1 to n
    static int soucetN(int cislo) {
        int soucet = 0;
        for (int i = 1; i <= cislo; i++) {
            soucet += i;  // Add each number from 1 to n to the sum
        }
        return soucet;
    }
}


