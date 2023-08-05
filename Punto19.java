import java.util.Scanner;

public class Punto19 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());
    }
}
