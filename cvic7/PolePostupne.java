package cvic7;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class PolePostupne {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

    public static void main(String[] args) {
        int[] pole = new int[10];
        int poleLast = -1;
        poleLast = pridejNaKonec(pole, 5, poleLast);
        poleLast = pridejNaKonec(pole, 4, poleLast);
        poleLast = pridejNaKonec(pole, 3, poleLast);
        poleLast = pridejNaKonec(pole, -2, poleLast);

        vypisDoLast(pole, poleLast);
    }

    private static void vypisDoLast(int[] pole, int poleLast) {
        for (int i = 0; i <= poleLast; i++) {
            vystup.print(pole[i] + " ");
        }
        vystup.println();
    }

    static int pridejNaKonec(int[] pole, int hodnota, int last) {
        pole[++last] = hodnota;
        return last;
    }

    static void vypisPole(int[] pole) {
        vystup.println("-------OBSAH POLE-------");
        for (int i = 0; i < pole.length; i++) {
            vystup.println(pole[i]);
        }

    }


}
