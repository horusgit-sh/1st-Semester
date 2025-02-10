package cvic8;
import java.util.ArrayList;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class PoleOperace {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

    public static void main(String[] args) {
        int[] pole = new int[10];
        int poleLast = -1;
        poleLast = pridejNaKonec(pole, 5, poleLast);
        poleLast = pridejNaKonec(pole, 4, poleLast);
        poleLast = pridejNaKonec(pole, 3, poleLast);
        poleLast = pridejNaKonec(pole, -2, poleLast);

        //poleLast = smazPrvek(pole,2,poleLast);
        poleLast = addInIndex(pole, 2, 10, poleLast);

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

    static int smazPrvek(int[] pole, int index, int poleLast) {
        if (index > poleLast) {
            throw new RuntimeException("Index out of bounds");
        }
        for (int i = index; i < poleLast; i++) {
            pole[i] = pole[i+1];
        }
        return poleLast-1;
    }
    static int addInIndex(int[] pole, int index, int hodnota,  int poleLast) {
        for (int i = poleLast; i >= index; i--) {
            pole[i+1] = pole[i];
        }
        pole[index] = hodnota;
        return poleLast+1;
    }
}
