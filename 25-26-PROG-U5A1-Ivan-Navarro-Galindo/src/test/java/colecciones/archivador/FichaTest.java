package colecciones.archivador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FichaTest {

    @Test
    void constructorYGetters() {
        Ficha f = new Ficha("Ana", "Pérez", 25);
        assertEquals("Ana", f.getNombre());
        assertEquals("Pérez", f.getApellidos());
        assertEquals(25, f.getEdad());
    }

    @Test
    void toStringIncluyeCampos() {
        Ficha f = new Ficha("Luis", "García", 30);
        String s = f.toString();
        assertTrue(s.contains("Luis"));
        assertTrue(s.contains("García"));
        assertTrue(s.contains("30"));
    }
}