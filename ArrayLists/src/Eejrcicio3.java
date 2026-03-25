import java.util.ArrayList;

public class Eejrcicio3 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sexoo00");
        names.add("Palipeli");
        names.add("Papadapoulos");
        names.add("eppe");

        System.out.println(masLargo(names));

    }

    public static String masLargo(ArrayList<String> names) {
        String masLargo = ""; //Creamos una variable local
        for (String name: names){
            if (name.length() > masLargo.length()){
            masLargo = name;
            }
        }

        return masLargo;
    }
}
