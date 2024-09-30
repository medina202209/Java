
package poo;


public class Cuenta {
    
    private String nombre ; //variable de istancia
    private double saldo; //variable de instancia
    
    //el constructor inicializa nombre con el parametro nombre
    public Cuenta(String nombre, double saldo){
        
        this.nombre = nombre; //asigna nombre a la variable de  instancia nombre
        
        if(saldo > 0.0){
            this.saldo = saldo; //lo asigna a la variable de instancia saldo
        }
    }
    
    //metodo que deposita (suma) solo una cantidad valida al saldo
    public void depositar(double montoDeposito){
        if(montoDeposito > 0.0){
            saldo = saldo + montoDeposito; //lo suma  al saldo
        }
    }
    
    //metodo que devuelve el saldo de la cuenta
    public double obtenerSaldo(){
        return saldo;
    }
    
    //metodo para establecer el nombre en el objeto
    
    public void establecerNombre(String nombre){
        
        this.nombre = nombre; //almacenar el nombre
    }
    
    //metodo para obtener el nombre del objeto
    public String obtenerNombre(){
        return nombre; //devuelve el valor de nombre a quien lo invocó
    }
    
    
    //metodo que permita retirar pero no puede superar el saldo
    
    public void retirar(double montoRetiro){
        if(montoRetiro <= saldo){
            saldo = saldo - montoRetiro;
        }else{
            System.out.println("No es posible realizar el retiro. Retiro superior al saldo");
        }
    }
}
