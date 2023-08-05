import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es " + factorial);
        }
    }
}
