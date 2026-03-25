package Academia;

public class Main {
    public static void main (String[] args){

        try {
            setNombre("");
        }catch (IllegalArgumentException e){
            System.out.println("Error" + e.getMessage());
        }



    }
}
