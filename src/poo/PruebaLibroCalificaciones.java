package poo;

public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        
        // arreglo de calificaciones de estudiantes
        int[] arregloCalif = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("CS101 Introduccion a la programacion en Java", arregloCalif);

        System.out.println(" Bienvenido al libro de calificaciones para: " + miLibroCalificaciones.obtenerNombreDelCurso());
        miLibroCalificaciones.procesarCalificaciones();
    }
}
