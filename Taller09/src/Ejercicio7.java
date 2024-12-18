import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();

        // Nombres de los estudiantes
        String[] estudiantes = {
                "Estudiante 1", "Estudiante 2", "Estudiante 3", "Estudiante 4",
                "Estudiante 5", "Estudiante 6", "Estudiante 7", "Estudiante 8",
                "Estudiante 9", "Estudiante 10", "Estudiante 11", "Estudiante 12",
                "Estudiante 13", "Estudiante 14", "Estudiante 15", "Estudiante 16",
                "Estudiante 17", "Estudiante 18", "Estudiante 19", "Estudiante 20",
                "Estudiante 21", "Estudiante 22", "Estudiante 23", "Estudiante 24",
                "Estudiante 25", "Estudiante 26", "Estudiante 27", "Estudiante 28"
        };

        // Arreglo para los promedios generados automáticamente
        double[] promedios = new double[28];

        // Generar promedios aleatorios entre 0 y 10
        for (int i = 0; i < promedios.length; i++) {
            promedios[i] = Math.round((5 + random.nextDouble() * 5) * 100.0) / 100.0; // Promedios entre 5 y 10, con 2 decimales
        }

        // Calcular el promedio del ciclo
        double suma = 0;
        for (double promedio : promedios) {
            suma += promedio;
        }
        double promedioCiclo = suma / promedios.length;
        System.out.println("\nPromedio del ciclo: " + String.format("%.2f", promedioCiclo) + "\n");

        // Determinar estudiantes por encima y por debajo del promedio
        System.out.println("Estudiantes con promedio por encima del promedio del ciclo:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] > promedioCiclo) {
                System.out.println(estudiantes[i] + " -> " + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes con promedio por debajo del promedio del ciclo:");
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] < promedioCiclo) {
                System.out.println(estudiantes[i] + " -> " + promedios[i]);
            }
        }

        // Determinar la mejor y la peor calificación
        double mejorCalificacion = promedios[0];
        double peorCalificacion = promedios[0];
        int iMejor = 0;
        int iPeor = 0;
        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > mejorCalificacion) {
                mejorCalificacion = promedios[i];
                iMejor = i;
            }
            if (promedios[i] < peorCalificacion) {
                peorCalificacion = promedios[i];
                iPeor = i;
            }
        }

        System.out.println("\nEstudiante con la mejor calificación: ");
        System.out.println(estudiantes[iMejor] + " -> " + mejorCalificacion);
        System.out.println("\nEstudiante con la calificación más baja: ");
        System.out.println(estudiantes[iPeor] + " -> " + peorCalificacion);
    }
}
