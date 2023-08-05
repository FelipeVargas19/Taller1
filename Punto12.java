import java.util.Scanner;

public class Punto12 {
    public static void main(String[] args) {
        //Realiza un programa que pida al usuario un número entero y determine si es un número primo o no
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número mayor que 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }

    }
}
