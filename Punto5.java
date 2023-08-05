import javax.swing.*;

public class Punto5 {

    public static void main(String[] args) {
        //Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

        int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero"));

        if(num1>num2){
            JOptionPane.showMessageDialog(null,"El numero mayor es : " + num1);
        }else{
            JOptionPane.showMessageDialog(null,"El numero mayor es : " + num2);
        }
    }
}
