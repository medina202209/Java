
package poo;

import java.util.Arrays;

public class MainVector {
    
    public static void main(String[] arg){
        
        //declaracion de vector
        int [] x = {1,8,10};
        
        MetodoVector op = new MetodoVector();
        
        op.cambio(x);
        
        System.out.println("Vector " + Arrays.toString(x));
        
    }
}
