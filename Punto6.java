import javax.swing.*;

public class Punto6 {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.

        int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));

        if(num1>0){
            JOptionPane.showMessageDialog(null, "El número "+ num1 + " es positivo");
        }else if (num1<0){
            JOptionPane.showMessageDialog(null, "El número "+ num1 + " es negativo");
        }else{
            JOptionPane.showMessageDialog(null, "El número es " + num1 );
        }
    }
}
