
package poo;

import java.util.Scanner;

public class PruebaCuenta {
    
    public static void main(String[] arg){
        
        
        
        Cuenta cuenta1 = new Cuenta("jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("john Blue",-7.53);
        
        // muestra el saldo inicial de cada objeto
        System.out.println("saldo de :" + cuenta1.obtenerNombre() + " $" + cuenta1.obtenerSaldo());
        System.out.println("saldo de :" + cuenta2.obtenerNombre() + " $" + cuenta2.obtenerSaldo());
        
        //crea un objeto Scanner para obtener la entrada desde el simbolo del sistema
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba el monto a depositar para cuenta1: "); // indicador (promt)        
        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario        
        System.out.println("sumando " + montoDeposito + " al saldo de cuenta1");
        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1
        
        // muestra los saldos
        System.out.println("Saldo de : " + cuenta1.obtenerNombre() + " " + cuenta1.obtenerSaldo());
        System.out.println("Saldo de : " + cuenta2.obtenerNombre() + " " + cuenta2.obtenerSaldo());
        
        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.println("sumando " + montoDeposito + " al saldo de la cuenta2");
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

        // muestra los saldos
        System.out.println("Saldo de : " + cuenta1.obtenerNombre()+ " " + cuenta1.obtenerSaldo());
        System.out.println("Saldo de : " + cuenta2.obtenerNombre()+ " " +  cuenta2.obtenerSaldo());
        
        
        System.out.println("Escriba el monto a retirar para la cuenta1");
        double montoRetiro = entrada.nextDouble();
        System.out.println("Validando saldo de la cuenta1");
        cuenta1.retirar(montoRetiro);
        
        // muestra los saldos
        System.out.println("Saldo de : " + cuenta1.obtenerNombre()+ " " + cuenta1.obtenerSaldo());
        System.out.println("Saldo de : " + cuenta2.obtenerNombre()+ " " +  cuenta2.obtenerSaldo());
        
        
        System.out.println("Escriba el monto a retirar para la cuenta2");
        montoRetiro = entrada.nextDouble();
        System.out.println("Validando saldo de la cuenta2");
        cuenta2.retirar(montoRetiro);
        
        // muestra los saldos
        System.out.println("Saldo de : " + cuenta1.obtenerNombre()+ " " + cuenta1.obtenerSaldo());
        System.out.println("Saldo de : " + cuenta2.obtenerNombre()+ " " +  cuenta2.obtenerSaldo());
    }
    
}
