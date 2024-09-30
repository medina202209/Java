package poo;

// Libro de calificaciones que utiliza un arreglo para almacenar las
//calificaciones de una prueba.
public class LibroCalificaciones {

    private String nombreDelCurso; //nombre del curso que representa este libro de calificaciones

    private int[] calificaciones; //arrreglo de calificaciones de estudiantes

    //constructor
    public LibroCalificaciones(String nombreDelCurso, int[] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    //metodo para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    //metodo para obtener el nombre del curdo
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    //Realiza varias operaciones sobre los datos
    public void procesarCalificaciones() {

        //imprimir el arreglo calificaciones en pantalla
        imprimirCalidaciones();

        //llama al metodo obtenerPromedio para calcular la calificacion promedio
        System.out.println("El promedio de la clase es: " + obtenerPromedio());

        //llama a los metodos obetenerMinima y obtenerMaxima
        System.out.println("La calificacion mas baja es: " + obtenerMinima() + " La calificacion mas alta es: " + obtenermaxima());
        
        // llama a imprimirGraficoBarras para imprimir el gráfico de distribución de calificaciones
            imprimirgraficoBarras();

    }

    //busca la calificacion mas baja
    public int obtenerMinima() {

        //asume que la calificaciones[0] es la mas baja
        int califBaja = calificaciones[0];

        //itera a traves del arreglo de calificaciones
        for (int calificacion : calificaciones) {

            //si calificacion es menor que califbaja, se asigna a califbaja
            if (calificacion < califBaja) {
                //nueva calificacion baja
                califBaja = calificacion;
            }

        }
        return califBaja;
    }

    //busca la calificacion mas alta
    public int obtenermaxima() {

        //asume que la calificacion[0] es la mas alta
        int califAlta = calificaciones[0];

        //itera a traves del arreglo de calificaciones
        for (int calificacion : calificaciones) {
            //Si calificacion es mayor que califAlta, se asigna a califAlta
            if (calificacion > califAlta) {
                califAlta = calificacion;
            }
        }

        return califAlta;
    }

    //determina la califacion promedio de la prueba    
    public double obtenerPromedio() {
        int total = 0;

        //suma las calificaciones para estudiante
        for (int calificacion : calificaciones) {
            total += calificacion;
        }

        return (double) total / calificaciones.length;
    }

    //imprime grafico de barras que muestra la distribucion de las calificaciones
    public void imprimirgraficoBarras() {

        System.out.println("Distribucion de calificaciones:");

        //almacena la frecuenta de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];

        // para cada calificación, incrementa la frecuencia apropiada
        for (int calificacion : calificaciones) {
            ++frecuencia[calificacion / 10];
        }

        // para cada frecuencia de calificación, imprime una barra en el gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiqueta de barra (“00-09: ”, ..., “90-99: ”, “100: ”)
            if (cuenta == 10) {
                System.out.printf("%5d:" , 100);
            } else {
                System.out.printf("%02d-%02d: ", 
                        cuenta * 10, cuenta * 10 + 9
                );
            }

            // imprime barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
                
                System.out.println();
            }
        }

    }

//imprime el contenido del arreglo calificaciones
    public void imprimirCalidaciones() {
        System.out.println("Las calificaciones son: ");

        //imprime la califacion de cada estudiante
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante % 2d: %3d%n", estudiante + 1, calificaciones[estudiante]
            );
        }
    }
}
