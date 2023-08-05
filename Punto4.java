import javax.swing.*;

public class Punto4 {
    public static void main(String[] args) {
        //Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.

        int edad = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese su edad"));

        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "Es mayor de edad");
        }else{
            JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
    }
}
