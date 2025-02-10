package cvic4;

import java.io.PrintStream;
import java.util.Scanner;

public class While{
    private static Scanner vstup = new Scanner(System.in);
    private static PrintStream vystup= System.out;

    public static void main(String[] args) {
        vystup.print("Zadej kurz $ v Kc :" );
        double kurz = vstup.nextDouble();
        vystup.print("Od :" );
        int castkaOd = vstup.nextInt();
        vystup.print("Do :" );
        int castkaDo = vstup.nextInt();
        vystup.print("Prirustek : " );
        int prirustek = vstup.nextInt();

        do {
            vystup.printf("%5d $ ............... %8.2f Kč\n", castkaOd, castkaOd * kurz);
            castkaOd += prirustek; //castkaOd = castkaOd+prirustek
        }
        while (castkaOd <= castkaDo);




    }
}
