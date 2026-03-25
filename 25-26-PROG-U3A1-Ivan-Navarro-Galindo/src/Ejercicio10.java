import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        final int NUM_MAX = 10;
        int[] entrada = new int[NUM_MAX];
        int[] repetidos = new int[NUM_MAX];
        int posicion = 0;
        Scanner sc = new Scanner(System.in);

        // inicializar el vector
        for (int i = 0; i < NUM_MAX; i++){
            entrada[i] = sc.nextInt();
        }

        // mostrar el vector ...
        System.out.println(Arrays.toString(entrada));

        // inicializar el vector de repetidos
        for (int i = 0; i < NUM_MAX; i++){
            for (int j = i + 1; j < NUM_MAX; j++){
                if (!contains(repetidos, entrada[i], posicion) && entrada[i] == entrada[j]) {
                    repetidos[posicion] = entrada[i];
                    posicion ++;
                    break;
                }
            }
        }

        // Mostrar mensaje si elementos repetidos
        System.out.println("Hay elementos repetidos: ");
        String mensaje = posicion > 0 ? "SÃ­\n" : "No\n";
        System.out.print(mensaje);

        // Mostrar elementos repetidos
//        for (int i = 0; i < NUM_MAX; i++) {
//            System.out.println(repetidos[i]);
//        }

        // Mostrar elementos repetidos con posiciÃ³n
        for (int i = 0; i < posicion; i++) {
            System.out.print("- " + repetidos[i] + " -> posiciones: ");
            for (int j = 0; j < NUM_MAX; j++) {
                if (repetidos[i] == entrada[j])
                    System.out.print((j+1) + ", ");
            }
            System.out.println();
        }
    }

    public static boolean contains (int[] vector, int elemento, int posMax) {
        for (int i = 0; i < posMax; i++){
            if (vector[i] == elemento) return true;
        }
        return false;
    }
}
