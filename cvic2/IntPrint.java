package cvic2;

import java.io.PrintStream;
import java.util.Scanner;

public class IntPrint {
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

    public static void main(String[] args) {
        vystup.println("Zadej cislo a = ");
        int a = vstup.nextInt();
        vystup.println("Zadej cislo b = ");
        int b = vstup.nextInt();

        int soucet = a*b;
        int rozdil = a-b;
        int soucin = a+b;
        int podil = a/b;


        vystup.println("Soucet = " + soucet);
        vystup.println("Rozdil = " + rozdil);
        vystup.println("Soucin = " + soucin);
        vystup.println("podil = " + podil);


        // int pom = a;
        //a = b;
        //b = pom;
        //vystup.printf("Hodnota a=%d, hodnota b=%d\n", a, b);

    }
}