package colecciones.archivador;

public class ClinicaApp {
    public static void main(String[] args) {
        Archivador a = new Archivador();

        Ficha f1 = new Ficha("Ivan","Navarro", 21);
        Ficha f2 = new Ficha("Pepe", "Viyuela", 46);
        Ficha f3 = new Ficha("Yusef","De Luque", 19);

        a.guardar(f1);
        a.guardar(f2);
        a.guardar(f3);

        a.listar();
        a.eliminar(f2);
        a.listar();
    }
}
