
package poo;

import javax.swing.JOptionPane;


public class Maintres {
    
    public static void main(String[] arg){
        
                
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        
        Operaciontres op = new Operaciontres();
        
        int suma = op.sumar(numero1, numero2);
        int resta = op.restar(numero1, numero2);
        int multiplicar = op.multiplicar(numero1, numero2);
        int division = op.dividir(numero1, numero2);
        
        op.mostraresultados(suma, resta, multiplicar, division);
        
               
        
        
        
        
    }
    
}
