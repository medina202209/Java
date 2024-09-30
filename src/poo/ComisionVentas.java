package poo;

import java.util.Arrays;

public class ComisionVentas {

    //arreglo ventas
    int ventas[];

    int salario;
    //int comision;
    //int total;

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

    public void salario() {

        int[] contenoEmpleados = new int[9];

        for (int i = 0; i < ventas.length; i++) {

            salario = getVentas()[i] * 9 / 100 + 200;
            
            System.out.printf("EL salario del vendedor %d:", i + 1);
            System.out.println(salario);

            if (salario >= 200 && salario < 300) {
                contenoEmpleados[0]++;
            } else if (salario >= 300 && salario < 400) {
                contenoEmpleados[1]++;
            } else if (salario >= 400 && salario < 500) {
                contenoEmpleados[2]++;
            } else if (salario >= 500 && salario < 600) {
                contenoEmpleados[3]++;
            } else if (salario >= 600 && salario < 700) {
                contenoEmpleados[4]++;
            } else if (salario >= 700 && salario < 800) {
                contenoEmpleados[5]++;
            } else if (salario >= 800 && salario < 900) {
                contenoEmpleados[6]++;
            } else if (salario >= 900 && salario < 1000) {
                contenoEmpleados[7]++;
            } else if (salario >= 1000) {
                contenoEmpleados[8]++;
            }

        }

        System.out.println("\nSalarios             # Vendedores");
        System.out.printf("$200 - $299          | %d%n", contenoEmpleados[0]);
        System.out.printf("$300 - $399          | %d%n", contenoEmpleados[1]);
        System.out.printf("$400 - $499          | %d%n", contenoEmpleados[2]);
        System.out.printf("$500 - $599          | %d%n", contenoEmpleados[3]);
        System.out.printf("$600 - $699          | %d%n", contenoEmpleados[4]);
        System.out.printf("$700 - $799          | %d%n", contenoEmpleados[5]);
        System.out.printf("$800 - $899          | %d%n", contenoEmpleados[6]);
        System.out.printf("$900 - $999          | %d%n", contenoEmpleados[7]);
        System.out.printf("$1,000 en adelante   | %d%n", contenoEmpleados[8]);
        
        System.out.println("---------------------------------------");
        System.out.println("Arreglo contador");
        System.out.println("" + Arrays.toString(contenoEmpleados));

    }

}
