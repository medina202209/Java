package poo;

import java.util.Arrays;

public class ComisionVentas {

    //arreglo ventas
    int ventas[];
    

    //constructor
    public ComisionVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    //metodo para validar salarios
    public void Comision() {

        for (int i = 0; i < ventas.length; i++) {

            int comision = ventas[i] * 9 / 100 + 200;

           int [] comisiones = new int[]{comision};

           System.out.println("vendedor " + i + "1" + Arrays.toString(comisiones));
        }
        

    }

}
