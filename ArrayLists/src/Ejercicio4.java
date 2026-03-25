import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);

        ArrayList<Integer> results = repetidos(numbers);
        System.out.println(results);


    }

    public static ArrayList<Integer> repetidos(ArrayList<Integer> numbers){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(!result.contains(numbers.get(i))){ //Si el resultado no contiene el numero lo añade
                result.add(numbers.get(i));
            }
        }
        return result;
    }
}
