import java.util.Scanner;

public class Punto20 {
    public static void main(String[] args) {
        //Realiza un programa que solicite al usuario una cadena y luego invierta su orden

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        StringBuilder cadenaInvertida = new StringBuilder();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }

        System.out.println("Cadena invertida: " + cadenaInvertida.toString());
    }
}
