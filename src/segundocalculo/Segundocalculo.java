package segundocalculo;

import factorial1.Factorial1;
import java.util.Scanner;

public class Segundocalculo {

    public static void main(String[] args) {
        Factorial1 fac = new Factorial1();
        Scanner tec = new Scanner(System.in);
        System.out.println("calculo de e^-x usando su formula igualitaria e^-x=1/∑(n) (x^j/j!)");
        System.out.println("");
        System.out.println("introduzca X");
        int x = tec.nextInt();
        System.out.println("introduzca j");
        int j = tec.nextInt();
        double suma = 0;

        for (int i = 0; i < j + 1; i++) {
            suma = suma + 1 / (Math.pow(x, i) / (fac.factorial(i)));
        }

        System.out.println("");
        System.out.println("resultado: " + suma);
    }
}
