/**
 * Actividad 2 - Computación en Java
 * Clase que guarda el nombre de un alumno y sus cinco calificaciones,
 * y calcula su promedio y su calificación final en letra.
 */
public class Alumno {

    // Atributos
    private String nombre;
    private double[] calificaciones = new double[5];

    public Alumno(String nombre, double[] calificaciones) {
        if (calificaciones.length != 5) {
            throw new IllegalArgumentException("Se necesitan exactamente 5 calificaciones");
        }
        this.nombre = nombre;
        // Se copian los valores al arreglo del alumno
        for (int i = 0; i < calificaciones.length; i++) {
            this.calificaciones[i] = calificaciones[i];
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    // Método 1: recibe el arreglo de calificaciones y regresa el promedio
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método 2: recibe el promedio y regresa la calificación en letra
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método 3: imprime los resultados, no regresa nada
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + String.format("%.2f", promedio));
        System.out.println("Calificación: " + calificacion);
    }
}
