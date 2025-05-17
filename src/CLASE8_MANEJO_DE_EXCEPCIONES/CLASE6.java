//Objetivo: Añadir manejo de ArithmeticException y InputMismatchException

package CLASE8_MANEJO_DE_EXCEPCIONES;
//import java.util.InputMismatchException;



import java.util.Scanner;

public class CLASE6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
/*
        System.out.println("1. Saludar\n2. Salir");
        System.out.println("Elige una opcion");
        try {

            int opcion = entrada.nextInt();
            int resultado = 5/opcion;

            switch (opcion) {
                case 1 -> {
                    System.out.println("Hola");
                    System.out.println("Buenos dias");
                }
                case 2 -> System.out.println("Saliendo....");

                default -> System.out.println("Opcion incorrecta");
            }
        } catch (InputMismatchException e){
            System.out.println("Debes introducir un numero");
        } catch (ArithmeticException e) {
            System.out.println("Division por 0");
        }finally {
            System.out.println("Fin");
        }
        entrada.close();
    }

}
*/

        System.out.print("Escribe un número (en texto): ");
        String texto = entrada.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + (numero * 10));
        }catch (NumberFormatException e){
            System.out.println("No puedes escribirlo con letras. Introduce un numero");
        entrada.close();
    }
    }
}
