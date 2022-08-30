import java.util.Scanner;

public class TraductorMorse {
    public static void main(String[] args) throws Exception {

        String palabra = "";
        int i = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("***** TRADUCTOR MORSE *****");
        System.out.println("***************************");
        System.out.print("Introduce una palabra para traducirla: ");
        System.out.println("");
        palabra = input.next().toLowerCase();

        for (i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                System.out.print(".- ");
            } else if (palabra.charAt(i) == 'b') {
                System.out.print("-... ");
            } else if (palabra.charAt(i) == 'c') {
                System.out.print("-.-. ");
            } else if (palabra.charAt(i) == 'd') {
                System.out.print("-.. ");
            } else if (palabra.charAt(i) == 'e') {
                System.out.print(". ");
            } else if (palabra.charAt(i) == 'f') {
                System.out.print("..-. ");
            } else if (palabra.charAt(i) == 'g') {
                System.out.print("--. ");
            } else if (palabra.charAt(i) == 'h') {
                System.out.print(".... ");
            } else if (palabra.charAt(i) == 'i') {
                System.out.print(".. ");
            } else if (palabra.charAt(i) == 'j') {
                System.out.print(".. ");
            } else if (palabra.charAt(i) == 'k') {
                System.out.print("-.- ");
            } else if (palabra.charAt(i) == 'l') {
                System.out.print(".-.. ");
            } else if (palabra.charAt(i) == 'm') {
                System.out.print("-- ");
            } else if (palabra.charAt(i) == 'n') {
                System.out.print(".- ");
            } else if (palabra.charAt(i) == 'o') {
                System.out.print("--- ");
            } else if (palabra.charAt(i) == 'p') {
                System.out.print(".--. ");
            } else if (palabra.charAt(i) == 'q') {
                System.out.print("--.- ");
            } else if (palabra.charAt(i) == 'r') {
                System.out.print(".-. ");
            } else if (palabra.charAt(i) == 's') {
                System.out.print("... ");
            } else if (palabra.charAt(i) == 't') {
                System.out.print("- ");
            } else if (palabra.charAt(i) == 'u') {
                System.out.print("..- ");
            } else if (palabra.charAt(i) == 'v') {
                System.out.print("...- ");
            } else if (palabra.charAt(i) == 'w') {
                System.out.print(".-- ");
            } else if (palabra.charAt(i) == 'x') {
                System.out.print("-..- ");
            } else if (palabra.charAt(i) == 'y') {
                System.out.print("-.-- ");
            } else if (palabra.charAt(i) == 'z') {
                System.out.print("--.. ");
            }
        }
    }
}
