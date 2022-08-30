public class Funciones {

    public static float suma(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    public static float resta(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    public static float multiplicacion(float num1, float num2) {
        float multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static float division(float num1, float num2) {
        float division = num1 / num2;
        return division;
    }

    public static float resto(float num1, float num2) {
        float resto = num1 % num2;
        return resto;
    }

    public static float mayor(float num1, float num2, float num3) {

        float mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else if (num3 > num1 && num3 > num2) {
            mayor = num3;
        } else {
            mayor = -1.0f;
        }
        return mayor;
        /*
         * if (num1 == num2 || num2 == num3) {
         * System.out.println("Debe introducir números diferentes");
         * } else if (num1 > num2 && num1 > num3) {
         * System.out.println("El número " + num1 + " es el mayor de los tres");
         * } else if (num2 > num1 && num2 > num3) {
         * System.out.println("El número " + num2 + " es el mayor de los tres");
         * } else if (num3 > num1 && num3 > num2) {
         * System.out.println("El número " + num3 + " es el mayor de los tres");
         * }
         */
    }

    public static String capicua(String capicua) {
        int i = 0;
        String capicuaReves = "";
        for (i = capicua.length() - 1; i >= 0; i--) {
            capicuaReves = capicuaReves + capicua.charAt(i);
        }
        if (capicua.equalsIgnoreCase(capicuaReves)) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("No es capicúa");
        }
        return capicua;
    }
}
