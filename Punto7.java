import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        //Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Ingrese un numero positivo.");
        } else {
            System.out.println("Tabla de multiplicar del " + num + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
        }


    }
}
