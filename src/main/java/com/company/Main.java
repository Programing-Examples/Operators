package main.java.com.company;

public class Main {

    public static void main(String[] args) {
        double x = 10;
        double y = 2;

        //Sumar dos numeros
        System.out.println("2 + 2 = " + (2+2));

        //Restar dos variables
        System.out.println("x - y = " + (x-y));

        //Multiplicar un numero por una variable
        System.out.println("2 * x = " + (2*x));

        //Dividir un numero por una variable
        System.out.println("30 / x = " + (30 / x ));

        /*Orden de preferencia:
         *Primero divisiones y multiplicaciones y de izquierda a derecha
         */
        System.out.println("30/y+1*2/2-3 = " + (30/y+1*2/2-3));

        //Agrupacion de operaciones
        //Parentesis de adentro hacia afuera
        System.out.println("((30/(y+1))*2)/(2-3) = " + (((30/(y+1))*2)/(2-3)));

        //Operadores lógicos
        System.out.println("x > y = " + (x > y));
        System.out.println("x <= 11 = " + (x <= 11));
        System.out.println("x <= 10 = " + (x <= 10));
        System.out.println("x <= 9 = " + (x <= 9));
        System.out.println("x == 10 = " + (x == 10));

        //Operador lógico 'y': &&
        System.out.println("Es (10>9) y (3<4)? " + ((10>9) && (3<4)));
        //Operador lógico 'o': ||
        System.out.println("Es (10>9) o (20<15)? " + ((10>9) || (20<15)));
    }
}
