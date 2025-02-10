package SinCos;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class SinCosMath {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.print("Set start angle in degrees: ");
        int answerStart = vstup.nextInt();
        vystup.print("Set stop angle degrees: ");
        int answerStop = vstup.nextInt();
        vystup.print("Set degrees step: ");
        int step = vstup.nextInt();
        Table(answerStop,answerStart,step);
    }
    private static void Table(int answerStop, int answerStart, int step) {
        vystup.printf("Sinus and cosinus in range <%d, %d> and distinction %d:\n", answerStart, answerStop, step );
        int i;
        for (i = answerStart ; i <= answerStop; i+=step ) {
            double rad= Math.toRadians(i);
            double sinAngle = Math.sin(rad);
            double cosAngle = Math.cos(rad);
            vystup.printf("Sin %d°: %f, cos %d°: %f\n", i, sinAngle, i, cosAngle );


        }


    }
}








