import java.util.ArrayList;

public class Ejercicio1 {


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();


        names.add("Juan");
        names.add("Lola");
        names.add("Juanma");
        names.add("Andrea");


        for (String name : names){
            if (name.startsWith("A")){
                System.out.println(name);
            }
        }

    }




}
