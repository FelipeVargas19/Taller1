import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario un número entero y determine si es par o impar

        Scanner leer = new Scanner(System.in);

        int num1;

        System.out.println("Ingrese un número");
        num1 = leer.nextInt();

        if(num1 % 2 ==0){
            System.out.println("Es un número par");
        }else{
            System.out.println("Es un número impar");
        }


    }
}
