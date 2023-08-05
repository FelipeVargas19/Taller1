public class Punto10 {

    public static void main(String[] args) {
        //Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

        int anterior = 0;
        int actual = 1;

        System.out.println("Primeros 20 números de la serie de Fibonacci:");
        System.out.print(anterior + " " + actual + " ");

        for (int i = 2; i < 20; i++) {
            int siguiente = anterior + actual;
            System.out.print(siguiente + " ");
            anterior = actual;
            actual = siguiente;
        }
    }
}