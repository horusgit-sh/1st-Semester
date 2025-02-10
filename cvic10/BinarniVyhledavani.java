package cvic10;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class BinarniVyhledavani {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

        public static void main(String[] args) {
            int[] pole = new int[10];
            naplnNahodne(pole, 0, 20);
            bubbleSort(pole);
            vypisPole(pole);
            vystup.println("Number for found: ");
            int number = vstup.nextInt();
            int index = binarySearch(pole, number);
            /*if (index >= 0){
             vystup.printf("Number %d found at index %d\n", number, index);
            } else {
                vystup.println("Number not found");
            }*/
            vystup.printf("Number %d found at index %d\n", number, index);
        }
       /* static int hledej(int[] pole, int number){
            int index = -1;
            for (int i = 0; i < pole.length; i++) {
                if (pole[i] == number) {
                    index = i;
                }
            }
            return index;
        }*/
        static int binarySearch(int[] pole, int number){
            int a = 0;
            int b = pole.length - 1;
            int c;
            do {
                c = (a + b) / 2;
                if (pole[c] < number) {
                    a = c + 1;
                } else if (pole[c] > number) {
                    b = c - 1;
                }else {
                    return c;
                }
            } while (a <= b);

            return -1;
        }
        static void bubbleSort(int[] pole){
            for (int i = 0; i < pole.length - 1; i++) {
                for (int j = 0; j < pole.length - i - 1; j++) {
                    if (pole[j] < pole[j + 1]) {
                        int temp = pole[j];
                        pole[j] = pole[j + 1];
                        pole[j + 1] = temp;
                    }
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
