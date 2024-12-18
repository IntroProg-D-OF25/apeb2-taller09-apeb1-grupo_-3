public class Ejercicio5 {
    public static void main(String[] args) {
        // Arreglos iniciales
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {
                "Kimberly Gonzalez",
                "Mark Hogan",
                "Teresa Martinez",
                "Julia Johnson",
                "Mark Cook",
                "Jennifer Manning",
                "Juan Vasquez"
        };

        // Arreglo para almacenar los promedios cualitativos
        String[] promediosCualitativos = new String[7];

        // Clasificar los promedios en cualitativos
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else if (promedios[i] >= 9) {
                promediosCualitativos[i] = "Sobresaliente";
            }
        }

        // Generar el reporte
        System.out.println("Reporte de Estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s%n", estudiantes[i], promedios[i], promediosCualitativos[i]);
        }
    }
}

/*
 * SALIDA DE RESULTADOS:
 * Reporte de Estudiantes:
 * Kimberly Gonzalez promedio: 10.00 promedio cualitativo: Sobresaliente
 * Mark Hogan promedio: 10.00 promedio cualitativo: Sobresaliente
 * Teresa Martinez promedio: 9.10 promedio cualitativo: Sobresaliente
 * Julia Johnson promedio: 7.00 promedio cualitativo: Bueno
 * Mark Cook promedio: 6.10 promedio cualitativo: Bueno
 * Jennifer Manning promedio: 4.00 promedio cualitativo: Regular
 * Juan Vasquez promedio: 8.00 promedio cualitativo: Bueno
 */