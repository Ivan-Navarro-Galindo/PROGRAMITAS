import java.util.ArrayList;

public class Ejercicio6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        ArrayList<Integer> results = mayorYMenor(numbers);
        System.out.println(results);


    }

    public static ArrayList<Integer> mayorYMenor(ArrayList<Integer> numbers){
        ArrayList<Integer> results = new ArrayList<>();

        int mayor = numbers.get(0); //Variable para almacenar el mayor
        int menor = numbers.get(0); //Variable para almacenar el menor


        //Recorremos el arrayList si el numero en el arraylist es mayor al que ya estaba almacendo se cambia por el nuevo, lo mismo para el menor
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > mayor){
                mayor = numbers.get(i);
            }
            if (numbers.get(i) < menor){
                menor = numbers.get(i);
            }

        }

        results.add(mayor);
        results.add(menor);



        return results;
    }
}
