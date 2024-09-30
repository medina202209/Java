
//creacion de paquetes y una clase
package poo;



//clase
public class Coche {
    //una clase debe contener atributos
    //atributos
    String color;
    String Marca;
    int km;
    int cant_ruedas;
    int cant_pasajeros;
    
    
    //creacion de un metodo main
    public static void main(String[] args){
        
        //clase
        Coche Coche1 = new Coche();
        
        //atributos del coche1
        Coche1.color = "blanco";
        Coche1.Marca = "Renault";
        Coche1.km= 0;
       
        
        
        //imprimir en pantalla
        System.out.println("El color del coche1 es: " + Coche1.color);
        System.out.println("La marca del coche1 es: " + Coche1.Marca);
        System.out.println("El km del coche1 es: " + Coche1.km);
               
        
        //nuevo 
        Coche taxi = new Coche();
        
        taxi.color = "negro";
        taxi.Marca = "Spark";
        taxi.km = 100;
        taxi.cant_pasajeros = 4;
        
        
        System.out.println("El color del taxi es: " + taxi.color);
        System.out.println("La marca del taxi es: " + taxi.Marca);
        System.out.println("El km del taxi es: " + taxi.km);
        System.err.println("La cantidad de pasajeros del taxi son :" + taxi.cant_pasajeros);
        
        
        Coche camion = new Coche();
        
        camion.color = "rojo";
        camion.Marca = "SCANIA";
        camion.km = 90;
        camion.cant_ruedas = 10;
        
        System.out.println("El color del camion es: " + camion.color);
        System.out.println("la marcar del camion es: " + camion.Marca);
        System.out.println("El km del camion es: " + camion.km);
        System.err.println("Cantidad de llantas del camion: " + camion.cant_ruedas);
               
    
    }
   
}
