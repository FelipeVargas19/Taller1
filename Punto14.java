import java.util.Scanner;

public class Punto14 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int sumaDivisores = 0;

            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }

            if (sumaDivisores == numero) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }
        }
    }
}
