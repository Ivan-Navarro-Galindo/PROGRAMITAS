package colecciones.archivador;

import java.util.ArrayList;
public class Archivador {

    //atributos
    private ArrayList<Ficha> pacientes = new ArrayList<>();

    //Metodos
    public void guardar(Ficha f) {
        pacientes.add(f);
        System.out.println("colecciones.archivador.Ficha añadidad correctamente");
    }

    public void eliminar(Ficha f) {
        pacientes.remove(f);
        System.out.println("colecciones.archivador.Ficha eliminada correctamente");
    }
    public int numeroFichas() {
        return pacientes.size();
    }


    public void listar() {
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(pacientes.get(i));
        }
    }

}
