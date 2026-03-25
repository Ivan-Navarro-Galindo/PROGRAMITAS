import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        int[] Vectores;
        Vectores = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número");
        for (int i = 0; i < 20; i++) {
            Vectores[i] = sc.nextInt();
        }
        int totalN=0;
        for (int i = 0; i < 20; i++){
            if (Vectores[i]>10){
                System.out.println("-Pos " +(i+1)+ ": " +Vectores[i]);
                totalN++;
            }
        }
        System.out.println("Total: " +totalN);
    }
}

