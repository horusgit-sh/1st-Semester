package cvic3;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 * @author Illia Spivak
 * @see PrintStream
 */
public class ifElse {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.println("Zadej cislo a: ");
        int cislo1 = vstup.nextInt();
        vystup.println("Zadej cislo b: ");
        int cislo2 = vstup.nextInt();
        vystup.println("Zadej cislo c: ");
        int cislo3 = vstup.nextInt();
        //int min = Math.min(cislo1, cislo2);
        //int min = (cislo1 < cislo2);
        //int min =cislo2
        //if (cislo1<cilso2){
        // min = cislo2;
        // {
        // vystup.printf("minimum z cisel %d a % d je %d\n" ,cislo1, cislo2, min);
        int min ;
        if (cislo1 < cislo2 && cislo1<cislo3) {
            min = cislo1;
        }else if (cislo2 < cislo1 && cislo2<cislo3){
             min = cislo2;
        } else {
             min = cislo3;
        }
        vystup.printf("Minimum z cisel %d, %d a %d je %d\n", cislo2, cislo3, cislo1, min);
        }


    }

