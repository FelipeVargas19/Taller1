import javax.swing.*;

public class Punto3 {

    public static void main(String[] args) {
        //Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.

        double area = 0;
        double perimetro = 0;
        double pi=3.14;

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        double resultadoArea = (area= pi * radio);
        double resultadoPeimetro =(perimetro= 2*pi*radio);

        JOptionPane.showMessageDialog(null,"El area del circulo es: " + resultadoArea);
        JOptionPane.showMessageDialog(null,"El perimetro del circulo es: " + resultadoPeimetro);




    }
}
