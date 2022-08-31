import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int num = 0;
        int i = 0;
        boolean esPrimo = true;

        System.out.println("Introduce un número:");
        num = input.nextInt();

        // Bucle que recorra desde un número menos al introducido hasta el 2.
        for (i = num - 1; i >= 2; i--) {

            if (num % i == 0) {
                // No es primo
                esPrimo = false;
                break; // Para que al encontrar el primero que sea divisible se pare el bucle.
            }
        }

        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número NO es primo");
        }
    }
}
