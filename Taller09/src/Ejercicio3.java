public class Ejercicio3 {
    public static void main(String[] args) {

        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};

        // Calcular la suma total de los elementos
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }

        // Calcular la media aritmética
        double media = suma / arreglo.length;

        // Inicializar contadores
        int porEncima = 0;
        int porDebajo = 0;

        // Contar elementos por encima y por debajo de la media
        for (int num : arreglo) {
            if (num > media) {
                porEncima++;
            } else if (num < media) {
                porDebajo++;
            }
        }

        // Mostrar resultados
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos por encima de la media: " + porEncima);
        System.out.println("Elementos por debajo de la media: " + porDebajo);

    }
}