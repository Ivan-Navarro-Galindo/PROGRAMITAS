import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] Vectores;
        Vectores = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 10; i++) {
            Vectores[i] = sc.nextInt();
        }
        int suma=0;
        for (int i = 0; i < 10; i++){
            if (Vectores[i] %2 == 0){
                suma = Vectores[i] + suma; //se suma a la variable suma el vector de manera individual(solo los pares)
            }
        }
        System.out.println("Suma de pares: " +suma);
    }
}