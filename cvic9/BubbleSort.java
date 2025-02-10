package cvic9;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class BubbleSort {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

        public static void main(String[] args) {
            int[] pole = new int[6];
            naplnNahodne(pole, 0, 20);
            vypisPole(pole);
            selectionSort(pole);
            vystup.println("Sorted array: ");
            vypisPole(pole);
        }
        static void bubbleSort(int[] pole){
            for (int i = 0; i < pole.length - 1; i++) {
                for (int j = 0; j < pole.length - i - 1; j++) {
                    if (pole[j] > pole[j + 1]) {
                        int temp = pole[j];
                        pole[j] = pole[j + 1];
                        pole[j + 1] = temp;
                    }
                }
            }
        }
        static void selectionSort(int [] pole){
            for (int i = 0; i < pole.length - 1; i++) {
                int imin = i;
                for (int j = 0; j < pole.length - i - 1; j++) {
                    if (pole[j] > pole[j + 1]) {
                        imin = j;
                    }
                }
                if (imin != i) {
                    int temp = pole[i];
                    pole[i] = pole[imin];
                    pole[imin] = temp;
                }
            }
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
