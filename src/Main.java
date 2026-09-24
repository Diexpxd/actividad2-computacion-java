import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        double[] calificaciones = new double[5];
        int i = 0;
        while (i < 5) {
            System.out.print("Calificación de la materia " + (i + 1) + ": ");
            // si no es numero se descarta y se vuelve a pedir
            if (!sc.hasNextDouble()) {
                System.out.println("Eso no es un número, intenta otra vez.");
                sc.next();
            } else {
                double calificacion = sc.nextDouble();
                if (calificacion < 0 || calificacion > 100) {
                    System.out.println("La calificación debe estar entre 0 y 100.");
                } else {
                    calificaciones[i] = calificacion;
                    i++;
                }
            }
        }

        Alumno alumno = new Alumno(nombre, calificaciones);
        double promedio = alumno.calcularPromedio(alumno.getCalificaciones());
        char calificacion = alumno.obtenerCalificacion(promedio);

        System.out.println();
        System.out.println("----- Resultados -----");
        alumno.imprimirResultados(alumno.getNombre(), promedio, calificacion);

        sc.close();
    }
}
