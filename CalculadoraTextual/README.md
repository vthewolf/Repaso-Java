El ejercicio consiste en crear una calculadora de tipo textual SIN interfaz gráfica. Toda la información se pide y se muestra a través de la consola.

Un cliente de la empresa CALCULATOR S.A desea implementar una calculadora para poder ejecutarla en uno de sus ordenadores
más antiguos y con pocos recursos. Para ello establece los siguientes requisitos:

- Tendrá una cabecera con el texto CALCULADORA TEXTUAL
- Debajo de la cabecera un menú que se mostrará una y otra vez hasta que el usuario pulse la opcion 0 como se muestra a continuación:
    
    Introduzca una opción del menú:
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Resto (módulo)
    6. Zodíaco
    7. Número mayor de tres numeros
    8. Capicúa
    0. Salir
    Introduzca una opción: (El usuario introduce una de las opciones anteriores)
    
A continuación se muestran cada una de las opciones:

1. Sumar
El programa mostrará al usuario: 
- Introduzca el primer numero flotante a sumar (el usuario introduce un numero y pulsa ENTER)
- Introduzca el segundo número flotante a sumar (el usuario introduce un número y pulsa ENTER)
El programa mostrará el resultado con el siguiente formato:
- La suma de NUM1 y NUM2 es RESULTADO

2. Restar
El programa mostrará al usuario: 
- Introduzca el primer numero flotante a restar (el usuario introduce un numero y pulsa ENTER)
- Introduzca el segundo número flotante a restar (el usuario introduce un número y pulsa ENTER)
El programa mostrará el resultado con el siguiente formato:
- La resta de NUM1 y NUM2 es RESULTADO

3. Multiplicar
El programa mostrará al usuario: 
- Introduzca el primer numero flotante a multiplicar (el usuario introduce un numero y pulsa ENTER)
- Introduzca el segundo número flotante a multiplicar (el usuario introduce un número y pulsa ENTER)
El programa mostrará el resultado con el siguiente formato:
- La multiplicación de NUM1 y NUM2 es RESULTADO

4. Dividir
El programa mostrará al usuario: 
- Introduzca el primer numero flotante a dividir (el usuario introduce un numero y pulsa ENTER)
- Introduzca el segundo número flotante a dividir (el usuario introduce un número y pulsa ENTER)

Si el segundo número introducido NO es 0 el programa devolvera: 
- La división de NUM1 y NUM2 es RESULTADO
En caso de que el segundo número sea un 0 devolvera:
- Error división por 0.

5. Resto (módulo)
El programa mostrará al usuario: 
- Introduzca el primer numero flotante a dividir (el usuario introduce un numero y pulsa ENTER)
- Introduzca el segundo número flotante a dividir (el usuario introduce un número y pulsa ENTER)

Si el segundo número introducido NO es 0 el programa devolvera: 
- El resto de NUM1 y NUM2 es RESULTADO
En caso de que el segundo número sea un 0 devolvera:
- Error división por 0.

6. Zodíaco
El programa mostrará al usuario:
- Introduzca su mes de nacimiento (1-12)

Si el usuario introduce un número menor que 1 o mayor que 12 deberá mostrar:
- Error. Debe introducir un número del 1 al 12
En caso de introducir un número del 1 al 12 deberá mostrar como resultado:
- Su signo zodiacal es: (el que toque)
      1. Aries
      2. Tauro
      3. Géminis
      4. Cáncer
      5. Leo
      6. Virgo
      7. Libra
      8. Escorpio
      9. Sagitario
      10. Capricornio
      11. Acuario
      12. Piscis

7. Número mayor de 3 números
El programa mostrará al usuario: 
- Introduzca el primer numero flotante de los tres (el usuario introduce un numero y pulsa ENTER)
- Introduzca el segundo número flotante de los tres (el usuario introduce un número y pulsa ENTER)
- Introduzca el tercer número flotante de los tres (el usuario introduce un número y pulsa ENTER)

El programa mostrará el resultado con el siguiente formato:
- El NUMx es el mayor de los tres números.
NOTA: Controlar que el usuario no introduzca números iguales. Siempre han de ser los tres diferentes.

8. Capicua
El programa mostrará al usuario:
- Introduzca un número para saber si es capicúa:

El usuario introduce un número entero y lo almacena en un String.

El programa devolverá:
- SI es capicúa si el número lo es o NO es capicúa en caso contrario.

0. Salir
El programa se ha de ejecutar una y otra vez hasta que el usuario pulse la opción 0. Al pulsar 0 el programa finaliza y muestra un texto informativo de "El programa ha finalizado" En caso de no introducir un número del 0 al 8 se deberá mostrar un mensaje "Opción erronea" y mostrar de nuevo el menu para solicitar de nuevo la opción al usuario.

