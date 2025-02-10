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
public class zadani3 {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.print("Zadej cislo a: ");
        int a = vstup.nextInt();
        vystup.print("Zadej cislo b: ");
        int b = vstup.nextInt();
        vystup.print("Zadej delitel: ");
        int delitel = vstup.nextInt();
        Delitelne(a,b,delitel);


    }

    private  static void Delitelne(int a, int b, int delitel) {
        vystup.printf("Cisla z intervalu <%d,%d> delitelna %d:\n", a, b, delitel);

        for (int i = a; i <= b; i++) {
            {
                if (i % delitel == 0) {
                    vystup.printf("%d\n", i);
                }
            }
        }
    }
}