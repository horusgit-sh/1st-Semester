package cvic9;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Ukazka implementce zasobniku pomoci primitivni tridy
 *
 * @author Illia Spivak
 *
 */
public class ZasobikAppObjektove {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        Zasobnik z1 = new Zasobnik();
        Zasobnik z2 = new Zasobnik();

        z1.push(10);
        z1.push(20);
        z1.push(30);
        z2.push(40);
        z2.push(50);

        vystup.println(z1.pop());
        vystup.println(z1.pop());
        vystup.println(z1.pop());
        vystup.println(z2.pop());
        vystup.println(z2.pop());
    }

    static class Zasobnik {
        int[] data = new int[20];
        int vrchol = -1;

        void push(int n) {
            if (vrchol + 1 == data.length) {
                throw new ArithmeticException("Zasobnik je plný");
            }
            data[++vrchol] = n;
        }
        int pop() {
            if (vrchol < 0){
                throw new ArithmeticException("Zasobnik je prazny");
            }
            return data[vrchol--];
        }
    }
}


