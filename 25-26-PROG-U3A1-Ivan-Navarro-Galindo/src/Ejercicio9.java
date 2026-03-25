import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        int[] Vectores;
        Vectores = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 20; i++) {
            Vectores[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(Vectores));

        int posicionMax = 0;
        int max = 0;
        for (int i = 0; i < 20; i++) {
            if (Vectores[i] > max ) {
                max = Vectores[i];
                posicionMax = i; //Cuando encuentra el maximo lo guarda en la posición i
            }
        }
        System.out.println("Mayor: " + max+ " en la posición " +(posicionMax+1));
    }
}
