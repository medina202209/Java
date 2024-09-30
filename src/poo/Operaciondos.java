package poo;

public class Operaciondos {

    int suma;
    int resta;
    int mult;
    int div;
    int contador;

    //metodo suma
    public void sumar(int num1, int num2) {
        suma = num1 + num2;
    }

    //metodo resta
    public void restar(int num1, int num2) {
        resta = num1 - num2;
    }

    public void multiplicar(int num1, int num2) {
        mult = num1 * num2;
    }

    public void division(int num1, int num2) {
        div = num1 / num2;
    }

    //ingrese dos numeros y mirar el numero mayor si es primo, par o impar
    //Valida si el numero mayor es primo
    public void numeroprimo(int num1, int num2) {

        if (num1 > num2) {

            for (int i = 1; i <= num1; i++) {
                if ((num1 % i) == 0) {
                    contador++;
                }
            }

            if (contador <= 2) {

                System.out.println("El numero: " + num1 + " es el mayor y es primo");
            } else {
                System.out.println("El numero: " + num1 + " no es primo");
            }
        } else if (num2 > num1) {
            for (int i = 1; i <= num2; i++) {
                if ((num2 % i) == 0) {
                    contador++;
                }
            }

            if (contador <= 2) {
                System.out.println("El numero: " + num2 + " es el mayor es primo");
            } else {
                System.out.println("El numero: " + num2 + " no es primo");
            }
        }
    }

    //valida si el numero mayor es par
    public void numeropar(int num1, int num2) {
        if (num1 > num2) {
            if (num1 % 2 == 0) {
                System.out.println("El numero: " + num1 + " Es par ");
            } else {
                System.out.println("El numero: " + num1 + " Es Impar");
            }
        } else if (num2 > num1) {
            if (num1 % 2 == 0) {
                System.err.println("El numero: " + num2 + " Es par");
            } else {
                System.err.println("El numero: " + num2 + " Es Impar");
            }
        }
    }

    //saca los resultados
    public void resultado() {
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
        System.out.println("La multiplicacion de los dos numeros es: " + mult);
        System.out.println("La division de los dos numeros es: " + div);
    }

}
