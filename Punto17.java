import java.util.Scanner;

public class Punto17 {
    public static void main(String[] args) {
        //Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número mínimo del rango: ");
        int min = scanner.nextInt();

        System.out.print("Ingrese el número máximo del rango: ");
        int max = scanner.nextInt();

        System.out.println("Números primos entre " + min + " y " + max + ":");

        for (int num = min; num <= max; num++) {
            boolean esPrimo = true;

            if (num <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
    }
}
