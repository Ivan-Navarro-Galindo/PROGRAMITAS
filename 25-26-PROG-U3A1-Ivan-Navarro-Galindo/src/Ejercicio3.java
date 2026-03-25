import java.util.Scanner;
public class Ejercicio3 {
    static void main() {
        int[] Vectores;
        Vectores = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 20; i++) {
            Vectores[i] = sc.nextInt();
        }
        for (int i = 0; i <20; i++){
            System.out.println(Vectores[i]);
            if((i+1) % 4 == 0){
            System.out.println();
            }
        }

    }
}