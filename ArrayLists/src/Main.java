import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {



    public static void main (String[] args){

        ArrayList<Integer> enteros = new ArrayList<>();

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(20);


        for (Integer num : enteros){
            if(num > 10){
                System.out.println(num);
            }
        }

        ArrayList<String> names = new ArrayList<>();

        names.add("Pepe");
        names.add("Juanito");
        names.add("Ivan");
        names.add("Juanma");
        names.add("Lucia");

       devolverCuatroLetras(names);
       //eliminar(names);

       ArrayList<Integer> numbers = new ArrayList<>();

       numbers.add(1);
       numbers.add(2);
       numbers.add(3);
       numbers.add(4);
       numbers.add(5);
       numbers.add(6);

       sumaDeElementos(numbers);




    }

    public static int sumaDeElementos(ArrayList<Integer> nums){
        int suma = 0;
        for (Integer num : nums) {
            suma += num;
        }
        return suma;
    }


    public static ArrayList<String> devolverCuatroLetras(ArrayList<String> names){
        ArrayList<String> resultado = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).length() > 4 ){ //Obtenemos cada palabra de cada posicion y hacemos la comparacion
                System.out.println(names.get(i));
            }
        }
            return resultado;
    }

    public static ArrayList<String> eliminar (ArrayList<String> names, String name){

        ArrayList<String> resultado = new ArrayList<>();

        for (String n : names){
            if(!n.equals(name)){
                resultado.add(n);
            }
        }
        return resultado;
    }

    public static ArrayList<Integer> ordenar (ArrayList<Integer> nums){
        ArrayList<Integer> resultado = new ArrayList<>(nums);

        Collections.sort(resultado);
        Collections.reverse(resultado);

        return resultado;
    }



}

