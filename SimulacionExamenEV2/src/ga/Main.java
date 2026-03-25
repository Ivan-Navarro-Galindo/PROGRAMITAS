package ga;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Gestor g = new Gestor();

        try {
            g.addRepartidor(new Repartidor(new Empleado("Pepe", "Martínez", 20, 1000), "La Vall"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Repartidor> repartidores = g.getRepartidor();

        g.addComercial(new Comercial("Ana", "Garcia", 35, 1100));

    }
}
