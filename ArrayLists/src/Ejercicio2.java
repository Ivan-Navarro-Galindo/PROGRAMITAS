import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(20);

        ArrayList<Integer> resultados = impares(numbers);
        System.out.println(resultados);

    }

    public static ArrayList<Integer> impares (ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) %2 != 0){
                result.add(numbers.get(i));
            }
        }

        return result;
    }
}
