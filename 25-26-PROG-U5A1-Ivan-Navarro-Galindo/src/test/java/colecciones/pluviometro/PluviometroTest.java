package colecciones.pluviometro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class PluviometroTest {

    @Test
    void constructorInicializaMesesVacios() {
        Pluviometro p = new Pluviometro();

        for (int i = 0; i < 12; i++) {
            ArrayList<Double> lista = p.visualizar(i);
            assertNotNull(lista);
            assertEquals(0, lista.size());
        }
    }

    @Test
    void insertarYVisualizar() {
        Pluviometro p = new Pluviometro();

        p.insertar(0, 2.5);
        p.insertar(0, 0.0);
        p.insertar(1, 10.0);

        assertEquals(2, p.visualizar(0).size());
        assertEquals(1, p.visualizar(1).size());
    }

    @Test
    void mediasMensualesYAnual() {
        Pluviometro p = new Pluviometro();

        p.insertar(0, 2.0);
        p.insertar(0, 4.0);
        p.insertar(1, 0.0);

        assertEquals(3.0, p.calcularMediaMensual(0), 1e-9);
        assertEquals(0.0, p.calcularMediaMensual(1), 1e-9);
        assertEquals(2.0, p.calcularMediaAnual(), 1e-9);
    }

    @Test
    void insertarMesInvalidoNoHaceNada() {
        Pluviometro p = new Pluviometro();

        p.insertar(-1, 5.0);
        p.insertar(12, 5.0);

        // Debe seguir todo vacío
        for (int i = 0; i < 12; i++) {
            assertEquals(0, p.visualizar(i).size());
        }
    }
}
