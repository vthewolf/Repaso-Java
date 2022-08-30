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
         */

        int option = 0;
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float resultado = 0.0f;
        Scanner input = new Scanner(System.in);

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
                    break;

                default:
                    System.out.println("Número incorrecto. Introduzca el número de una opción de la lista.");
                    break;
            }

        } while (option != 0);

    }
}
