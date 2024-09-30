package poo;

import javax.swing.JOptionPane;

public class Maindos {
    
    public static void main(String[] arg) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        
        Operaciondos op = new Operaciondos();
        
        op.sumar(num1, num2);
        op.restar(num1, num2);
        op.multiplicar(num1, num2);
        op.division(num1, num2);
        op.numeroprimo(num1, num2);
        op.numeropar(num1, num2);
        
        op.resultado();
    }
    
}
