/*
 * Ejercicio 11: Programa que
 * Lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 */
package cac.java.tdp;
import java.util.Scanner;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double rango1 = 0d;
        double F = 0;
        
        Scanner teclado = new Scanner (System.in);

        System.out.println ("Escriba los grado centrigados que quiere convertir: ");
        
        rango1 = teclado.nextDouble();
        
        F = 32 + ( 9 * (rango1) / 5);
        
        System.out.println (F+ "° F");
        
    }
    
}
