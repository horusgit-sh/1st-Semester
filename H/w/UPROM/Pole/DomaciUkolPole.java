package H.w.UPROM.Pole;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class DomaciUkolPole {

    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);

        public static void main(String[] args) {
            int[] pole = new int[10];
            naplnNahodne(pole, -10, 10);
            int difOdd = sumOfOddIndexes(pole);
            int sumEven = sumOfEvenIndexes(pole);
            int difAll = difOdd - sumEven;
            int sumAll = difOdd + sumEven;
            vypisPole(pole);
            vystup.println("Difference between numbers with odd index and with even indexes: " + difAll);
            vystup.println("Sum of numbers with odd index and with even indexes: " + sumAll);




        }
        private static int sumOfEvenIndexes(int[] pole){
            int sum = pole[0];
           for (int i = 2; i < pole.length; i += 2) {
               sum += pole[i];
           }
           return sum;
        }
        private static int sumOfOddIndexes(int[] pole){
        int sumOdd = pole[0];
         for (int i = 0; i < pole.length; i += 2) {
            sumOdd += pole[i];
         }
         return sumOdd;
        }

        private static void naplnNahodne(int[] pole, int a, int b) {
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
