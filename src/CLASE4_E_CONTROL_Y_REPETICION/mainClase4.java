package CLASE4_E_CONTROL_Y_REPETICION;

import java.util.Scanner;
//sin esto, no vas a poder pedirle al usuario datos

public class mainClase4 {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int numero = scanner.nextInt();//con esto, leo el número del usuario

        //estructura del if-else
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        scanner.close();//cierre del scanner
        si elimino el inicio y fin de la nota, es el escript de la primera parte de la clase: uso de if */
/*
// créame un menu de opciones  interactivo con el uso de switch donde el usuario elija una opción
 y muestre un mensaje

        Scanner scanner = new Scanner(System.in);

//Menu de opciones
        System.out.println("*Menu de ociones*");
        System.out.println("1. Saludar");
        System.out.println("2. Mensaje motivacional de Llados");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opción");
        int opción = scanner.nextInt();//leemos la opcion del usuario.

        //evaluar opciones con el switch
        switch (opción){
            case 1:
                System.out.println("Hola, bienvenido");
                break;
            case 2:
                System.out.println("Bro, esto es masivo!");
                break;
            case 3:
                System.out.println("saliendo del programa");
                break;
            default:
                System.out.println("Macho, me has dado algo que no entiendo");
        }
        scanner.close();
        hasta aqui script 2 uso de switch
*/
/*
//Imprimir los numeros del 1 al 10 con un for
// usar un bucle para contar del 1 l 10

        for (int i= 1; i<=10; i++){
            System.out.println("Numero: " +i);
            //asi muestro cada iteración
        }

*/
/*
//Uso de while para contar hasta que el usuario ingrese 0
//📌 Objetivo: Pedir números al usuario hasta que ingrese 0.

        Scanner scanner = new Scanner(System.in); // Creamos un Scanner
        long numero;//yo he cambiado un int que venia en el ejercicio de mario por un long.
        // tambien se debe modificar en la linea 74. nextlong en lugar de nextint.

        // Pedimos el primer número
        System.out.print("Introduce un número (0 para salir): ");
        numero = scanner.nextLong();

        // Mientras el número no sea 0, sigue pidiendo números
        while (numero != 0) {
            System.out.println("Has introducido: " + numero);
            System.out.print("Introduce otro número (0 para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa finalizado.");
        scanner.close(); // Cerramos el scanner
*/
//Uso de do-while para pedir contraseña y que no pueda entrar hata que introduzca java123
//📌 Objetivo: Pedir una contraseña y no permitir el acceso hasta que el usuario ingrese java123.
        Scanner scanner = new Scanner(System.in);
        String password;

        // Bucle do-while, se ejecuta al menos una vez
        do {
            System.out.print("Introduce la contraseña: ");
            password = scanner.nextLine();
        } while (!password.equals("java123")); // Se repite hasta que la contraseña sea correcta

        System.out.println("Acceso concedido.");
        scanner.close(); // Cerramos el scanner

    }
}
