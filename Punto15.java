import java.util.Scanner;

public class Punto15 {
    public static void main(String[] args) {
        // Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int numeroOriginal = numero;
        int numeroReverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        if (numeroReverso == numeroOriginal) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es un número capicúa.");
        }
    }
}
