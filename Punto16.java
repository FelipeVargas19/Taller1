import java.util.Scanner;

public class Punto16 {

    public static void main(String[] args) {
        //Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número hasta el cual desea imprimir la serie de Fibonacci: ");
        int limite = scanner.nextInt();

        int anterior = 0;
        int actual = 1;

        System.out.println("Serie de Fibonacci hasta " + limite + ":");

        while (anterior <= limite) {
            System.out.print(anterior + " ");

            int siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
    }


}
