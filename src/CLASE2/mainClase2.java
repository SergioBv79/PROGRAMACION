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
        int suma = numero1 + numero2;

        //operaciones relacionales
        int x = 10;
        int y= 20;
        System.out.println("es x igual a y: " +(x==y));
        System.out.println("Es x diferente a y:? " + (x!=y));
        System.out.println("Es x mayor de y:?" + (y>x));
        System.out.println("Es x menor que y?:" + (x<y));


        // Operadores lógicos. Es aquel que combina operaciones lógicas (&, &&, etc.)
            boolean a = true;
            boolean b = false;
        System.out.println("a AND b: " +(a && b));
        System.out.println("a OR b: " + (a ||b));
        System.out.println("NOT a: " +(!a));
        // expresiones y/o evaluaciones
            int resultado = (10 + 5) * 2/3;
            int resultado2 = 10 + 5 * 2/3;
            int resultado3 = 10 + 5;


        System.out.println("El resultado de la expresion es: " + resultado);
        System.out.println("El resultado de la expresion2 es: " + resultado2);
        System.out.println("El resultado de la expresion3 es: " + resultado3);
    }
}
