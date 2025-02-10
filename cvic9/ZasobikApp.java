package cvic9;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Ukazka implementce zasobniku pomoci primitivni tridy
 *
 * @author Illia Spivak
 *
 */
public class ZasobikApp {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        Zasobnik z1 = new Zasobnik();

        push(z1, 10);
        push(z1, 20);
        push(z1, 30);
        push(z1, 40);
        push(z1, 50);

        vystup.println(pop(z1));
        vystup.println(pop(z1));
        vystup.println(pop(z1));
        vystup.println(pop(z1));
        vystup.println(pop(z1));
    }

    private static int pop(Zasobnik z1) {
        if (z1.vrchol < 0){
            throw new ArithmeticException("Zasobnik je prazny");
        }
        return z1.data[z1.vrchol--];

    }

    private static void push(Zasobnik z1, int hodnota) {
        if (z1.vrchol+1 == z1.data.length) {
            throw new RuntimeException("Zasobnik je plny");
        }
        z1.data[++z1.vrchol] = hodnota;
    }


    static class Zasobnik {
        int [] data =new int [20];
        int vrchol = -1;
    }
}
