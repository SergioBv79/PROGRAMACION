package CLASE5_E_DE_SALTO;
import java.util.Scanner;// para usar el scanner para introducr datos desde consola.

public class CLASE5 {
    public static void main(String[] args) {

/* Ejercicio 1 – Salir de un bucle while con break
Haz un programa que pida al usuario números enteros positivos.
El programa debe terminar cuando el usuario introduzca el número 0. Usa un bucle while con break.*/
        Scanner scanner = new Scanner(System.in);

        /*while (true) {
            System.out.print("Introduce un número entero positivo (0 para salir): ");
            int numero = scanner.nextInt();

            // Si el número es 0, se termina el bucle con break
            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            }
            // Si el número no es 0, muestra el número introducido
            System.out.println("Has introducido el número: " + numero);
        }
        scanner.close();*/

 /*Ejercicio 2 – Saltarse los múltiplos de 3 con continue
Escribe un programa que muestre los números del 1 al 10,
excepto los múltiplos de 3. Usa un bucle for con continue. */

       /* for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;  // Salta la iteración si el número es múltiplo de 3
            }
            System.out.println(i);  // Imprime el número si no es múltiplo de 3
        }*/

/*Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
Haz un programa que busque el número 7 entre los números del 1 al 20.
Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break. */

// Iterar del 1 al 20
        // Iterar del 1 al 20
       /* for (int i = 1; i <= 20; i++) {
            // Si el número es 7, mostrar el mensaje y terminar el bucle
            if (i == 7) {
                System.out.println("¡Encontré el número 7!");
                break; // Termina el bucle
            }
                System.out.println("Probando que se ve con: " + i);
            }*/

/*Ejercicio 4 – Evitar mostrar letras vocales con continue
Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.*/

      /*  // Recorrer cada letra de la palabra
        String palabra = "PROGRAMACION";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i); // Obtener la letra en la posición i

            // Si la letra es una vocal, se salta a la siguiente iteración
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'
                    ||letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                     {
                continue; // Saltar la letra y continuar con la siguiente
            }

            System.out.print(letra); // Mostrar la letra si no es vocal
        }*/


/*Ejercicio 5 – Dividir dos números con try-catch
Haz un programa que divida dos números enteros introducidos
 por el usuario. Usa try-catch para evitar que el programa se rompa si el divisor es 0. */

        /* try {
            // Solicitar al usuario el numerador y el divisor
            System.out.print("Introduce el numerador: ");
            int numerador = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce el divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());

            // Intentar realizar la división
            int resultado = numerador / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }
        // Captura la excepción de división por cero
        catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por 0. El divisor no puede ser 0.");
        }
        // Captura la excepción si el usuario introduce un valor no numérico
        catch (NumberFormatException e) {
            System.out.println("Error: Por favor, introduce solo números enteros.");
        }
        finally {
            // Cerrar el objeto Scanner
            scanner.close();
        }*/
/* 🟨 Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con
control de excepción.
Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter
en esa posición usando try-catch. Si se produce un error, muestra un mensaje.
 */
       try {
            // Solicitar al usuario la palabra
            System.out.print("Introduce una palabra: ");
            String palabra = scanner.nextLine();

            // Solicitar la posición de la que se quiere acceder
            System.out.print("Introduce la posición (número entero): ");
            int posicion = Integer.parseInt(scanner.nextLine());

            // Intentar acceder al carácter en la posición indicada
            char caracter = palabra.charAt(posicion);

            // Mostrar el carácter en la posición especificada
            System.out.println("El carácter en la posición " + posicion + " es: " + caracter);
        }
        // Captura la excepción si la posición está fuera de rango
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: La posición está fuera del rango de la palabra.");
        }
        // Captura la excepción si el usuario introduce un valor no numérico
        catch (NumberFormatException e) {
            System.out.println("Error: Por favor, introduce un número válido para la posición.");
        }
        finally {
            // Cerrar el objeto Scanner
            scanner.close();
        }


    }
}
