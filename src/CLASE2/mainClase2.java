package CLASE2;

public class mainClase2 {
    public static void main(String[] args) {
        //DECLARAS UNA CONSTANTE CON LA PALABRA FINAL
        final double PI = 3.1416;
        final int mayoriaEdad = 18;
        //fin declaracion constante
        System.out.println("El valor de Pi es:" + PI);
        System.out.println("La edad adulta para ser adulto:" + mayoriaEdad);


        int numero1 = 5;
        int numero2 = 8;
        int sum = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + sum);


        //operaciones relacionales
        int x = 10;
        int y = 20;
        System.out.println("es x igual a y: " + (x == y));
        System.out.println("Es x diferente a y:? " + (x != y));
        System.out.println("Es x mayor de y:?" + (y > x));
        System.out.println("Es x menor que y?:" + (x < y));


        // Operadores lógicos. Es aquel que combina operaciones lógicas (&, &&, etc.)
        boolean C = true;
        boolean D = false;
        System.out.println("a AND b: " + (C && D));
        System.out.println("a OR b: " + (C || D));
        System.out.println("NOT a: " + (!C));
        // expresiones y/o evaluaciones
        int resultado = (10 + 5) * 2 / 3;
        int resultado2 = 10 + 5 * 2 / 3;
        int resultado3 = 10 + 5;


        System.out.println("El resultado de la expresion es: " + resultado);
        System.out.println("El resultado de la expresion2 es: " + resultado2);
        System.out.println("El resultado de la expresion3 es: " + resultado3);

        //EJERCICIOS CLASE 2. ( 05.03.25)
        /* 1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81
         *y muestra su valor por pantalla.
         */
        final double GRAVEDAD = 9.81;
        System.out.println("El valor de la gravedad es:" + GRAVEDAD);

        /* 2️⃣ Declara dos variables a = 25 y b = 7.
         * Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
         */

        int a = 5;
        int b = 8;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("La diferencia entre " + a + " y " + b + " es: " + resta);
        System.out.println("El producto de " + a + " por " + b + " es: " + multiplicacion);
        System.out.println("El cociente  " + a + " y " + b + " es: " + division);


        /* 3️⃣ Declara una variable edad e imprime
         * si la persona es mayor de edad (>= 18) o menor de edad (< 18).
         */
        int edad = 20;

        if (edad >= 18) {// asi con condicional buscado en la web
            System.out.println("La persona es mayor de edad.");
        } else
            System.out.println("La persona es menor de edad.");


        // intentandolo hacer con operadores relacionales

        int age = 20;
        System.out.println("¿Es mayor de edad? " + (age >= 18));
        System.out.println("¿Es menor de edad? " + (age < 18));

        //continuar aqui con el ejercicio 4



    }
}
