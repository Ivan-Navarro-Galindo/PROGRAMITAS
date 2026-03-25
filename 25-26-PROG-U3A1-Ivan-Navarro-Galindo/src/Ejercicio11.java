import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    int[] VectoresP = new int[10];
    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 10; i++) {
        VectoresP[i] = sc.nextInt();
    }
        int mayorDiez = 0;
        int[] VectoresV = new int[mayorDiez];
        for (int i = 0; i < VectoresP.length; i++) {
            if (VectoresP[i] > 10) {
                mayorDiez++;
            }
        }
        System.out.println("V: " +Arrays.toString(VectoresP));
        System.out.println("P: "+mayorDiez);






    }
}