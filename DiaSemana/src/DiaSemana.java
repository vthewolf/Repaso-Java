import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) throws Exception {

        /*
         * Realizar un programa que le pida un número que indica el día de la semana.
         * El programa debe leer el número y mostrar el día de la semana al que
         * corresponde
         * 1 -- Lunes
         * 2 -- Martes
         * 3 -- Miércoles
         * 4 -- Jueves
         * 5 -- Viernes
         * 6 -- Sábado
         * 7 -- Domingo
         * Cualquier otro -- Error
         */

        int num = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        num = input.nextInt();

        if (num == 1) {
            System.out.println("Es Lunes");
        } else if (num == 2) {
            System.out.println("Es Martes");
        } else if (num == 3) {
            System.out.println("Es Miércoles");
        } else if (num == 4) {
            System.out.println("Es Jueves");
        } else if (num == 5) {
            System.out.println("Es Viernes");
        } else if (num == 6) {
            System.out.println("Es Sábado");
        } else if (num == 7) {
            System.out.println("Es Domingo");
        } else {
            System.out.println("Número incorrecto");
        }
    }
}
