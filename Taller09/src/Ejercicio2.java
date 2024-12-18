/**
 * Escriba un programa que permita presentar la siguiente serie:
 *
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos
 */
public class Ejercicio2 {
    public static void main(String[] args) {
                int cantidadNumeros = 12; // Número de términos a mostrar
                int fibonacci1 = 1, fibonacci2 = 1;
                int contadorPrimos = 0, primos = 2;

                System.out.println("Serie de Fibonacci y Primos:");
                for (int i = 0; i < cantidadNumeros; i++) {
                    // Generar el número de Fibonacci actual
                    int fibonacciActual;
                    if (i == 0 || i == 1) {
                        fibonacciActual = 1;
                    } else {
                        fibonacciActual = fibonacci1 + fibonacci2;
                    }
                    if (i >= 2) {
                        fibonacci1 = fibonacci2;
                        fibonacci2 = fibonacciActual;
                    }

                    // Encontrar el siguiente número primo
                    while (true) {
                        int contadorDivisores = 0;
                        for (int j = 2; j <= Math.sqrt(primos); j++) {
                            if (primos % j == 0) {
                                contadorDivisores++;
                                break;
                            }
                        }
                        if (contadorDivisores == 0) {
                            contadorPrimos++;
                            break;
                        }
                        primos++;
                    }

                    // Imprimir el número de Fibonacci y el primo actual
                    System.out.print(fibonacciActual + "/" + primos + (",") );

                    primos++;
                }
            }
        }
        

