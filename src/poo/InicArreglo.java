/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author alexi
 */
public class InicArreglo {

    // crea e imprime arreglos bidimensionales
    public static void main(String[] args) {
        int[][] arreglo1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arreglo2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Los valores en arreglo1 por filas son:");
        imprimirArreglo(arreglo1); // muestra arreglo1 por filas

        System.out.println("Los valores en arreglo2 por filas son: ");
        imprimirArreglo(arreglo2); // muestra arreglo2 por filas
    }

    // imprime filas y columnas de un arreglo bidimensional
    public static void imprimirArreglo(int[][] arreglo) {
        // itera a través de las filas del arreglo
        for (int fila = 0; fila < arreglo.length; fila++) {
            // itera a través de las columnas de la fila actual
            for (int columna = 0; columna < arreglo[fila].length; columna++) {
                System.out.printf("%d ", arreglo[fila][columna]);
            }

            System.out.println();
        }
    }

}
