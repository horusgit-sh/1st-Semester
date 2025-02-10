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
public class PoleMin {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
            int[] pole = new int [10];
            naplNahodne(pole, 100, 200);
            int min = minimumPole(pole);
            int minIndex = minimumIndex(pole);



           vystup.println("Minimum in array 'pole': " + min);
           vystup.println("Minimum index: " + minIndex);
           printArray(pole);
        }

    private static int minimumIndex(int[] pole) {
        int mIndex = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[mIndex] > pole[i]) {
                mIndex = i;
            }
        }
        return mIndex;
    }

    private static int minimumPole(int[] pole) {
        int min = pole[0];
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] < min) {
                min = pole[i];
            }
        }
        return min;
    }

    static void naplNahodne(int[] pole, int a, int b) {
        int d = Math.abs(b - a);
        for (int i = 0; i < pole.length; i++) {
            pole[i] = (int) (Math.random() * (d + 1) + a);
        }
    }
     static void printArray(int[] pole) {
        System.out.println("Array: ");
        for (int i = 0; i < pole.length; i++) {
            vystup.println(pole[i]);
        }
    }
}