import java.util.Scanner;

public class CalculadoraTextual {
    public static void main(String[] args) throws Exception {

        /*
         * Crea una calculadora textual sin interfaz gráfica que implemente las
         * siguientes funciones:
         * Sumar
         * Restar
         * Multiplicar
         * Dividir
         * Resto (módulo)
         * Zodíaco
         * Número mayor de tres numeros
         * Capicua
         */

        Scanner input = new Scanner(System.in);
        int option = 0;
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float resultado = 0.0f;
        // PARA EL USO DEL STRING BUFFER
        String capicua = "";
        String capicuaReves = "";
        StringBuffer sb;

        do {
            System.out.println("******* CALCULADORA TEXTUAL *******");
            System.out.println("Introduzca una opción del menú:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("6. Zodíaco");
            System.out.println("7. Número mayor de 3 números");
            System.out.println("8. Capicúa");
            System.out.println("0. Salir");
            System.out.println("************************************");
            System.out.print("Introduzca un número:");
            option = input.nextInt();
            switch (option) {
                case 0:
                    System.out.println("El programa ha finalizado.");
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("Introduzca el primer número flotante a sumar:");
                    num1 = input.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a sumar:");
                    num2 = input.nextFloat();
                    resultado = Funciones.suma(num1, num2);
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Introduzca el primer número a restar:");
                    num1 = input.nextFloat();
                    System.out.println("Introduzca el segundo número a restar:");
                    num2 = input.nextFloat();
                    resultado = Funciones.resta(num1, num2);
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Introduzca el primer número flotante a multiplicar:");
                    num1 = input.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a multiplicar:");
                    num2 = input.nextFloat();
                    resultado = Funciones.multiplicacion(num1, num2);
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + resultado);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Introduzca el primer número flotante a dividir:");
                    num1 = input.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a dividir:");
                    num2 = input.nextFloat();
                    if (num2 == 0) {
                        System.out.println("Error al dividir por 0");
                    } else {
                        resultado = Funciones.division(num1, num2);
                        System.out.println("La división de " + num1 + " y " + num2 + " es: " + resultado);
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.println("Introduzca el primer número flotante a dividir:");
                    num1 = input.nextFloat();
                    System.out.println("Introduzca el segundo número flotante a dividir:");
                    num2 = input.nextFloat();
                    if (num2 == 0) {
                        System.out.println("Error al dividir por 0");
                    } else {
                        resultado = Funciones.resto(num1, num2);
                        System.out.println("El resto de " + num1 + " y " + num2 + " es: " + resultado);
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("Introduzca su mes de nacimiento (1-12");
                    num1 = input.nextFloat();

                    if (num1 == 1) {
                        System.out.println("Su signo zodiacal es Aries");
                    } else if (num1 == 2) {
                        System.out.println("Su signo zodiacal es Tauro");
                    } else if (num1 == 3) {
                        System.out.println("Su signo zodiacal es Géminis");
                    } else if (num1 == 4) {
                        System.out.println("Su signo zodiacal es Cáncer");
                    } else if (num1 == 5) {
                        System.out.println("Su signo zodiacal es Leo");
                    } else if (num1 == 6) {
                        System.out.println("Su signo zodiacal es Virgo");
                    } else if (num1 == 7) {
                        System.out.println("Su signo zodiacal es Libra");
                    } else if (num1 == 8) {
                        System.out.println("Su signo zodiacal es Escorpio");
                    } else if (num1 == 9) {
                        System.out.println("Su signo zodiacal es Sagitario");
                    } else if (num1 == 10) {
                        System.out.println("Su signo zodiacal es Capricornio");
                    } else if (num1 == 11) {
                        System.out.println("Su signo zodiacal es Acuario");
                    } else if (num1 == 12) {
                        System.out.println("Su signo zodiacal es Piscis");
                    } else {
                        System.out.println("ERROR. Debe introducir un número entre 1 y 12");
                    }
                    break;
                case 7:
                    System.out.println("Introduzca el primer número flotante de los tres");
                    num1 = input.nextFloat();
                    System.out.println("Introduzca el segundo número flotante de los tres");
                    num2 = input.nextFloat();
                    System.out.println("Introduzca el tercer número flotante de los tres");
                    num3 = input.nextFloat();
                    resultado = Funciones.mayor(num1, num2, num3);
                    System.out.println("El número mayor de los tres es: " + resultado);

                    break;
                case 8:
                    System.out.print("Introduzca un número (entero) para saber si es capicúa: ");
                    capicua = input.next();
                    // Hecho con función
                    // Funciones.capicua(capicua);

                    // OTRO MODO
                    sb = new StringBuffer(capicua);
                    capicuaReves = sb.reverse().toString();
                    if (capicua.equalsIgnoreCase(capicuaReves)) {
                        System.out.println("Es capicúa");
                    } else {
                        System.out.println("No es capicúa");
                    }
                    break;
                default:
                    System.out.println("Número incorrecto. Introduzca el número de una opción de la lista.");
                    break;
            }

        } while (option != 0);

    }
}
