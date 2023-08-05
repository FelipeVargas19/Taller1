public class Punto18 {
    public static void main(String[] args) {
        //Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 8;

        StringBuilder contraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = (int) (Math.random() * caracteres.length());
            contraseña.append(caracteres.charAt(index));
        }

        System.out.println("Contraseña generada: " + contraseña.toString());
    }
    }
