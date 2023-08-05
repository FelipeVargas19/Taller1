import java.io.InputStream;
import java.util.Scanner;

public class Punto13 {
    public static void main(String[] args) {
        //Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        System.out.print("Ingrese el número de decimales a los que desea redondear: ");
        int decimales = scanner.nextInt();

        double factor = Math.pow(10, decimales);
        double numeroRedondeado = Math.round(numero * factor) / factor;

        System.out.println("El número redondeado a " + decimales + " decimales es: " + numeroRedondeado);
    }


}
