package cvic10;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/**
 * třida představující základ všech npvych projektů v předn
 * uprom
 *
 * @author Illia Spivak
 * @see PrintStream
 */
public class ShablonaMatic {
    /**
     * reference pro standartni vystup aplikace
     */
    static PrintStream vystup = System.out;
    static Scanner vstup = new Scanner(System.in);
    static Random generatot = new Random(System.currentTimeMillis());


    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        naplnNahodne(a, 0 ,4);
        naplnNahodne(b, 1, 3);
        vystup.println("Matrix a: ");
        vypisMatici(a);
        vystup.println("Matrix b: ");
        vypisMatici(b);
        sumMatici(a, b);
        MultiplyMatrix(a, b);


    }
    static void naplnNahodne(int[][] m, int min, int max){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = generatot.nextInt(max - min + 1) + min;
            }
        }
    }
    static void vypisMatici(int[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                vystup.print(m[i][j] + " ");
            }
            vystup.println();
        }
    }
    static void sumMatici(int [][] a, int [][] b){
        int col1 = a[0].length;
        int col2 = b[0].length;
        int row1 = a.length;
        int row2 = b.length;
        if (col1 != col2 && row1 != row2){
            throw new IllegalArgumentException("Cannot sum matrices of different dimensions");
        }
        int [][] c = new int[3][3];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        vystup.println("Sum of matrices: ");
        vypisMatici(c);
    }
    static void MultiplyMatrix(int [][] a, int[][] b ){
        int col1 = a[0].length;
        int col2 = b[0].length;
        int row1 = a.length;
        int row2 = b.length;
        if (col1 != row2){
            throw new IllegalArgumentException("Cannot multiply matrices of different dimensions");
        }
        int [][] c = new int[row1][col2];
        for (int i = 0; i < col1; i++){
            for (int j = 0; j < col2; j++){
                for (int k = 0; k < a.length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        vystup.println("Multiplication of matrices: ");
        vypisMatici(c);
    }
}
