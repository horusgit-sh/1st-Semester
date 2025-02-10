package cvic2;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 * @author Illia Spivak
 * @see PrintStream
 */
public class PrikladCisla {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.print("Zadej cislo: ");
        float cislo1 = vstup.nextFloat();
        vystup.print("Zadej cislo:");
        float cislo2 = vstup.nextFloat();
        float vysledek = (float) (cislo1 + cislo2);
        vystup.println("Vysledek:" + vysledek);


    }
}