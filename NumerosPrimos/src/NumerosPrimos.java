import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) throws Exception {

        int num = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca un número para comprobar si es primo: ");
        num = input.nextInt();
        // TODO
        for (i = num - 1; i >= 2; i--) {
            if (num % i == 0) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }

    }
}
