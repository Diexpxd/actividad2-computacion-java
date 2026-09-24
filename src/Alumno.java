public class Alumno {

    private String nombre;
    private double[] calificaciones = new double[5];

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        for (int i = 0; i < 5; i++) {
            this.calificaciones[i] = calificaciones[i];
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    // recibe el arreglo y regresa el promedio
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        return suma / calificaciones.length;
    }

    // recibe el promedio y regresa la letra
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

    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + String.format("%.2f", promedio));
        System.out.println("Calificación: " + calificacion);
    }
}
