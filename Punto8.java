import java.util.Random;
import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {
        //Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(20) + 1;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Adivina el número!");

        while (!adivinado) {
            System.out.print("Ingresa un numero: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAdivinar) {
                System.out.println("El número es menor.");
            } else {
                adivinado = true;
                System.out.println("¡Felicidades! ¡Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos.");
            }

        }
    }
}
