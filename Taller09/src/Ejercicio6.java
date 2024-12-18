import java.util.Scanner;

/**
 * Analice el siguiente código
 *
 * Scanner entrada = new Scanner(System.in);
 * String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
 * String inicial;
 * boolean bandera = true;
 * while(bandera){
 *     System.out.println("Ingrese una letra");
 *     inicial = entrada.nextLine();
 *  }
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que coincida con la primera letra de los "nombres"
 * contenidos en del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes, y no quemar
 * de forma constante dichas iniciales, imagine que estudiantes podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.
 */
public class Ejercicio6 {
    public static void main(String[] args) {

                Scanner entrada = new Scanner (System.in);
                String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
                String inicial;
                boolean bandera = true;

                while (bandera) {
                    System.out.println("Ingrese una letra:");
                    inicial = entrada.nextLine().toUpperCase().substring(0, 1);

                    for (int i = 0; i < estudiantes.length; i++) {
                        if (estudiantes[i].substring(0, 1).toUpperCase().equals(inicial)) {  // Comparamos la primera letra.
                            System.out.println("Se encontró una coincidencia con el nombre: " + estudiantes[i]);
                            bandera = false;  // Salimos del ciclo.
                            break;  // Salimos del ciclo
                        }
                    }

                    // NO HAY CONINCIDENCIA PREGUNTA OTRA VEZ
                    if (bandera) {
                        System.out.println("No se encontró ninguna coincidencia. Intente nuevamente.");
                    }
                }

                entrada.close();
            }
        }

/**
 * Ingrese una letra:
 * K
 * Se encontró una coincidencia con el nombre: Kimberly
 *
 * Process finished with exit code 0
 */

