package Pole;

import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class SablonaPole {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

        public static void main(String[] args) {
            int[] pole = new int[6];
            naplnNahodne(pole, -10, 10);
            vypisPole(pole);
        }
        static void naplnNahodne(int[] pole, int a, int b) {
            int d = Math.abs(b-a);
            for (int i = 0; i < pole.length; i++) {
                pole[i] = (int) (Math.random()*(d+1)+a);
            }
        }
        static void vypisPole(int[] pole) {
            vystup.println("-------OBSAH POLE-------");
            for (int i = 0; i < pole.length; i++) {
                vystup.println(pole[i]);
            }

        }

}
