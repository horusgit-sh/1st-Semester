package cvic4;

import java.io.PrintStream;
import java.util.Scanner;

public class Rovnice {
    private static Scanner vstup = new Scanner(System.in);
    private static PrintStream vystup = System.out;

    public static void main(String[] args) {
        int a,b,c,d;
        do {

            vystup.print("Zadej a = ");
            a = vstup.nextInt();
            vystup.print("Zadej b = ");
            b = vstup.nextInt();
            vystup.print("Zadej c = ");
            c = vstup.nextInt();


            d = b*b - 4*a*c;
             if (d<=0) {
                 vystup.println("Zadej znovu, nevychazi 2 koreni! ");
             }
        }
        while (d>=0);
        double x1 = (-b+Math.sqrt(d))/(2*a);
        double x2 = (-b-Math.sqrt(d))/(2*a);
        vystup.printf("Rovnice x1 = %.2f\nRovnice x2 = %.2f\n ", x1, x2 );
    }

}
