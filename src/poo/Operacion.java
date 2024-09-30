
package poo;

import javax.swing.JOptionPane;


public class Operacion {
    
    //atributos de la clase
    int num1;
    int num2;
    int suma;
    int resta;
    int mult;
    int div;
    
    //metodos que pide datos al usuario
    
    public void leerNumero(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1; "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2: "));
    }
    
    
    //metodo sumar
    
    public void sumar(){
        suma = num1 + num2;
    }
    
    //metodo resta
    public void restar(){
        resta = num1 - num2;
    }
    
    //metodo multiplicación
    public void multiplicar(){
        mult = num1 * num2;
    }
    
    //metodo división
    public void dividir(){
        div = num1 / num2 ;
    }
    
    
    //metodo comparación
    
    public void compararnumeros(){
        if (num1 > num2) {
            System.out.println("Numero 1 es mayor que Numero 2");
        } else if (num1 < num2) {
            System.out.println("Numero 1 es menor que Numero 2");
        } else {
            System.out.println("Numeros iguales");
        }
    }
    
    //metodo mostrar resultados
    
    public void mostrarresultados(){
        
        System.out.println("Numero 1 es: " + num1);
        System.out.println("Numero 2 es: " + num2);
        System.out.println("La suma es :" +  suma);
        System.out.println("La resta es: "  +  resta);
        System.out.println("La multiplicacón es: " + mult);
        System.out.println("La división es: " + div);
        
    }
    
    
}
