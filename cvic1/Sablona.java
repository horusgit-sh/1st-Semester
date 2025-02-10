package cvic1;

import java.awt.*;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class Sablona {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.print("Zadej svoje jmeno: ");
        String jmeno = vstup.nextLine();
        vystup.println("Hello " + jmeno);
        //vypise na obrazovku text
    }
}
