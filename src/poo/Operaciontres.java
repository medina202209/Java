
package poo;


public class Operaciontres {
    
    public int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;                
    }
    
    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    
    public int multiplicar(int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }
    
    public int dividir(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
    
    public void mostraresultados(int suma,int resta,int mult,int div){
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros: " + resta);
        System.out.println("La multiplicacion de los dos numeros es: " + mult);
        System.out.println("La division de los dos numeros es: " + div);
    }
}
