import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {

        //Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.

        int suma=0;
        int resta=0;
        int multiplicacion=0;
        int division=0;

        Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1= leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2= leer.nextInt();

        System.out.println("La suma de los dos numeros es de: " + (suma=num1+num2));
        System.out.println("La resta de los dos numeros es de: " + (resta=num1-num2));
        System.out.println("La multiplicacion de los dos numeros es de: " + (multiplicacion=num1*num2));
        System.out.println("La division de los dos numeros es de : " + (division=num1/num2));



    }
}
