package cvic9;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class PoleSort {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

        public static void main(String[] args) {
            int [] array = new int[10];
            naplnNahodne(array, 10, -10);
            Arrays.sort(array);
            vypisPole(array);
            vystup.println(Arrays.toString(array));
            int summ = 0;
        }


        static void bubbleSort(int[] pole){
            for (int i = 0; i < pole.length - 1; i++){
                for (int j = 0; j < pole.length-i-1; j++){
                    if (pole[j] < pole[j+1]){
                        int a = pole[j];
                        pole[j] = pole[j+1];
                        pole[j+1] = a;
                    }
                }
            }
        }

        static int evenIndexes(int[] pole, int sum){
            for (int i = 0; i < pole.length; i += 2){
                sum = sum + pole[i];
            }
            return sum;
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
