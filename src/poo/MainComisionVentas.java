package poo;

import java.util.Arrays;
import java.util.Scanner;

public class MainComisionVentas {

    public static void main(String[] args) {

        int[] ventas = new int[5];

        ComisionVentas Ventas = new ComisionVentas(ventas);

        Scanner teclado = new Scanner(System.in);

        //ingresar valores de las ventas por teclado
        for (int i = 0; i < ventas.length; i++) {
            System.out.printf("Ingresa venta del vendedor %d: ", i + 1);
            ventas[i] = teclado.nextInt();
        }

        //mostrar arreglo con las ventas
        System.out.println("" + Arrays.toString(ventas));
        
        Ventas.Comision();

    }
}
