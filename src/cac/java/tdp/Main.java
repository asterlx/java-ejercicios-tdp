/*
 * EJERCICIO 01: Programa java que realice lo siguiente:
 *  declarar una variable N de tipo int,
 *  una variable A de tipo double y
 *  una variable C de tipo char y asigna a cada una un valor.
 *  A continuación muestra por pantalla: El valor de cada variable,
 *  la suma de N + A, la diferencia de A - N, el valor numérico correspondiente
 *  al carácter que contiene la variable C.
 * SPOILER ALERT: posible solución aquí.
    http://puntocomnoesunlenguaje.blogspot.com.es/2012/10/java-ejercicios-iniciales.html
 */
package cac.java.tdp;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 3;
        double A = 8.5;
        char C = 'x';
        
        System.out.println("Variable N = " + N);
        System.out.println("Variable N = " + A);
        System.out.println("Variable N = " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numérico del carácter " + C + " = " + (int)C);
        
    }
   
   
}
