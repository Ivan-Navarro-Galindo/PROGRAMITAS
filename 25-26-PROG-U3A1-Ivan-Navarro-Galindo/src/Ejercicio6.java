import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] Vectores;
        Vectores = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 10; i++) {
            Vectores[i] = sc.nextInt();
        }
        System.out.println("Vector: "+Arrays.toString(Vectores));
        for (int i = 0; i < 10; i++){
            if (Vectores[i] %2 == 0) {
                System.out.println("- Pos " +(i+1)+ ": " +Vectores[i]);
            }
        }
    }

}
