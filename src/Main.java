import java.util.Scanner;

public class Main {

    // Si los datos vienen de un archivo (java Main < datos.txt) no se ven en pantalla,
    // así que en ese caso se imprimen para que quede claro qué se leyó
    private static final boolean ENTRADA_DE_ARCHIVO = System.console() == null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = leerLinea(scanner);

        double[] calificaciones = new double[5];
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = leerCalificacion(scanner, i + 1);
        }

        Alumno alumno = new Alumno(nombre, calificaciones);

        double promedio = alumno.calcularPromedio(alumno.getCalificaciones());
        char calificacion = alumno.obtenerCalificacion(promedio);

        System.out.println();
        System.out.println("----- Resultados -----");
        alumno.imprimirResultados(alumno.getNombre(), promedio, calificacion);

        scanner.close();
    }

    // Pide una calificación hasta que sea un número entre 0 y 100
    private static double leerCalificacion(Scanner scanner, int numero) {
        while (true) {
            System.out.print("Calificación de la materia " + numero + ": ");
            String entrada = leerLinea(scanner).trim();
            try {
                double valor = Double.parseDouble(entrada);
                if (valor >= 0 && valor <= 100) {
                    return valor;
                }
                System.out.println("La calificación debe estar entre 0 y 100.");
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número, intenta otra vez.");
            }
        }
    }

    private static String leerLinea(Scanner scanner) {
        String linea = scanner.nextLine();
        if (ENTRADA_DE_ARCHIVO) {
            System.out.println(linea);
        }
        return linea;
    }
}
