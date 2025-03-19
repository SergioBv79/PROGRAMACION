package CLASE3;

public class mainClase3 {
    public static void main(String[] args) {
        //1. Conversion implícita de int a double
        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;

        System.out.println("Numero entero: " + numeroEntero);
        System.out.println("Numero convertido a double: " + numeroDecimal);

        //2. Conversion explícita double a int con truncamiento

        double valorDecimal = 8.80;
        //conversion explicita (casteo o casting)
        int valorEntero = (int) valorDecimal;

        System.out.println("valor original, double: " + valorDecimal);
        System.out.println("valor convertido con el int: " + valorEntero);

        //3. Desbordamiento. De Int a Byte
        int numeroGrande = 190;
        //Conversion explicita a byte
        byte numeroPequeño = (byte) numeroGrande;

        System.out.println("Numero original int: " + numeroGrande);
        System.out.println("Numero convertido a byte: " + numeroPequeño);

        //4. Conversion de String a int con integer.parseInt()
        String texto = "123";
        int numero = Integer.parseInt(texto);
        System.out.println("Texto: " + numero);
        System.out.println("Numero convertido a texto: " + numero);

        //5. Convertir un int a String
        int numerito = 456;
        String textito = String.valueOf(numerito);

        System.out.println("Numero: " + numerito);
        System.out.println("Texto convertido: " + textito);


    //7. Conversion double a String

        double precio = 99.99;
        String textoPrecio = Double.toString(precio);
            System.out.println("Precio como String: " + textoPrecio);

    //8. Conversion a String
        boolean activo = true;
        // conversion a String
        String estado = String.valueOf(activo);
            System.out.println("Estado convertido: " + estado);

    //9. Conversion para operaciones matematicas
        int a = 5;
        int b = 2;
        System.out.println("Division entera: " + (a/b));
        //conversion a double para tener decimales
        double resultado = (double)a/b;
        System.out.println("Division con casting: " + resultado);

    //10. Conversion de long a int y de float a int
    long numeroLargo = 1_000_000_000L;
    //convertir del long al int
        int numeroEnterito = (int)numeroLargo;
        System.out.println("Numero con cambio de long a int: " + numeroEnterito);



    }
}
