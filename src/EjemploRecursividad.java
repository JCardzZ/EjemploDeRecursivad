/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class EjemploRecursividad {

    /**
     * La recursividad consiste en llamarse a si misma, y su objetivo principal
     * es impedir que se llame eternamente a si misma, prácticamente es una
     * condicion que se sabe hasta donde va llegar pero en este caso es
     * automatica, muy similar a la lógica de un For, pero a la vez totalmente
     * diferente.
     *
     * @param args
     */
    /**
     * Ejercicio básico de recursividad: Sumar los números naturales hasta N
     * (Dado por nosotros) de forma totalmente recursiva.
     *
     * @param args
     */
    public static void main(String[] args) {

        int n = 8;
        int resultado = metodoRecursivo(n);
        System.out.println(resultado);
    }

    public static int metodoRecursivo(int numero) {

        int recursividad;

        if (numero == 1) {
            return 1;
        } else {
            recursividad = numero + metodoRecursivo(numero - 1);
        }

        return recursividad;
    }
}
