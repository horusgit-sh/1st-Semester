package cvic3;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 * @author Illia Spivak
 * @see PrintStream
 */
public class seradit {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.println("Zadej cislo a: ");
        int a = vstup.nextInt();
        vystup.println("Zadej cislo b: ");
        int b = vstup.nextInt();
        vystup.println("Zadej cislo c: ");
        int c = vstup.nextInt();

        int pom;
        if (a > b) {
            pom = a;
            a = b;
            b = pom;
        }
        if (b > c) {
            pom = b;
            b = c ;
            c = pom;
        }
        if  (a > b ){
        pom = a;
        a = b;
        b = pom;
        }
        vystup.printf("Serazeno %d, %d ,%d\n", a, b, c);
    }
}
