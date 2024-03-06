package caminoBasico;

import java.util.Scanner;

/**
 *
 * @author martae
 */
public class Numeros {

    public static void main(String[] args) {

        int num;
        Scanner sc;
        System.out.println("Introduce un número: ");
        sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo");
        }

        if (num < 0) {
            System.out.println("El número es negativo");
        }

        if (num == 0) {
            System.out.println("El número es cero");
        }

    }

}
