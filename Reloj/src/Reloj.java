import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) throws Exception {

        /* Crear una aplicación que compruebe si la hora introducida es correcta */

        int hora = 0;
        int minuto = 0;
        int segundo = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Introduzca una hora");
            hora = input.nextInt();
            System.out.println("Introduzca los minutos");
            minuto = input.nextInt();
            System.out.println("Introduzca los segundos");
            segundo = input.nextInt();
        }

        if (hora < 24 && hora >= 0 && minuto <= 59 && minuto >= 0 && segundo <= 59 && segundo >= 0) {
            System.out.println("La hora es correcta. Son las: " + hora + " horas, " + minuto + " minutos, y " + segundo
                    + " segundos.");
        } else {
            System.out.println("Hora incorrecta");
        }

    }
}
