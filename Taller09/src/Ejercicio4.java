/**
 * Ejercicio 4
 * Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.
 *
 * int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int media;
        // Calcular la suma de todos los elementos
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        // Calcular la media aritmética
        media = suma / arreglo.length;

        // Variables para contar los elementos por encima y por debajo de la media
        int arribaDeLaMedia = 0;
        int abajoDeLaMedia = 0;

        // Recorrer el arreglo y contar los elementos
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > media) {
                arribaDeLaMedia++;
            } else if (arreglo[i] < media) {
                abajoDeLaMedia++;
            }
        }

        // Imprimir los resultados
        System.out.println("La media aritmética es: " + media);
        System.out.println("Elementos arriba de la media: " + arribaDeLaMedia);
        System.out.println("Elementos abajo de la media: " + abajoDeLaMedia);
    }
}
/**
 * La media aritmética es: 9
 * Elementos arriba de la media: 8
 * Elementos abajo de la media: 4
 */
