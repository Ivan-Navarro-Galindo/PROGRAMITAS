import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        String[] Vectores;
        Vectores = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 10; i++) {
            Vectores[i] = sc.nextLine();
            }
        for (int i = 0; i < 11; i = i+2){
            System.out.println("- Pos " +i+": " +Vectores[i]);
        }
    }

}
