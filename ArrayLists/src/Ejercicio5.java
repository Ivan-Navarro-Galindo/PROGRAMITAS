import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ivan");
        names.add("Duncan");

        ArrayList<String> results = aMayusculas(names);
        System.out.println(results);

    }

    public static ArrayList<String> aMayusculas(ArrayList<String> names){
        ArrayList<String> result = new ArrayList<>();

        for (String name : names){
            result.add(name.toUpperCase());
        }
        return result;
    }
}
