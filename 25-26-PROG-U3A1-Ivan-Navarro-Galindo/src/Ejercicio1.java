import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        int[] Vectores;
        Vectores = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 10; i++) {
            Vectores[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int dato : Vectores) {
            System.out.print(dato+ " ,");
        }
        System.out.print("]");
    }
}
