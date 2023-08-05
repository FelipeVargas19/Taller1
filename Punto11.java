import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese elsegundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Las longitudes de los lados deben ser positivas.");
        } else {
            double semiperimetro = (lado1 + lado2 + lado3) / 2.0;
            double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

            System.out.println("El área del triángulo es: " + area);
        }

    }
}
