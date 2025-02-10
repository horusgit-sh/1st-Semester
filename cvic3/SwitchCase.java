package cvic3;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 * @author Illia Spivak
 * @see PrintStream
 */
public class SwitchCase {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);


    public static void main(String[] args) {
        vystup.println("Zadej cislo dnej v tydnu: ");
        byte den = vstup.nextByte();
        String denStr;
        switch (den) {
            case 1:
                denStr = "Pondeli";
                break;
            case 2:
                denStr = "Uteri";
                break;
            case 3:
                denStr = "Streda";
                break;
            case 4:
                denStr = "Ctvrtek";
                break;
            case 5:
                denStr = "Patek";
                break;
            case 6:
                denStr = "Sobota";
                break;
            case 7:
                denStr = "Nedele";
                break;
            default:
                denStr = "V tydnu je jemon 7 dnu!";
        }
        vystup.println(denStr);

        }
    }

