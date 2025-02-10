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
public class zadani2 {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);
    static int cislo;



    public static void main(String[] args) {
        vystup.println("Zadej a: ");
        int a = vstup.nextInt();
        vystup.println("Zadej n: ");
        int n = vstup.nextInt();

        if (n == 0) {
            vystup.println("qwertt");
        } else if (n == 1) {
            vystup.println(a);
        } else {
            vystup.printf("Mocnina %d^%d je %d\n", a, n, mocnina(a, n));
        }

    }
    static int mocnina(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}