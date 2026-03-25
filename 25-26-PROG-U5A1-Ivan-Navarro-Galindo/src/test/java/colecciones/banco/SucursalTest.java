package colecciones.banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void constructorYGettersSetters() {
        Cuenta c = new Cuenta("Ana", "ES00", 100.0, 1.5);

        assertEquals("Ana", c.getNombre());
        assertEquals("ES00", c.getCuenta());
        assertEquals(100.0, c.getSaldo(), 1e-9);
        assertEquals(1.5, c.getTipoDeInteres(), 1e-9);

        c.setNombre("Ana P.");
        c.setCuenta("ES11");
        c.setSaldo(200.0);
        c.setTipoDeInteres(2.0);

        assertEquals("Ana P.", c.getNombre());
        assertEquals("ES11", c.getCuenta());
        assertEquals(200.0, c.getSaldo(), 1e-9);
        assertEquals(2.0, c.getTipoDeInteres(), 1e-9);
    }

    @Test
    void ingresoInvalidoNoModificaSaldo() {
        Cuenta c = new Cuenta("A", "ES01", 100.0, 1.0);

        c.ingreso(-5);
        assertEquals(100.0, c.getSaldo(), 1e-9);
    }

    @Test
    void reintegroSuperiorNoModificaSaldo() {
        Cuenta c = new Cuenta("A", "ES01", 100.0, 1.0);

        c.reintegro(150);
        assertEquals(100.0, c.getSaldo(), 1e-9);
    }

    @Test
    void ingresoYReintegroValido() {
        Cuenta c = new Cuenta("A", "ES01", 100.0, 1.0);

        c.ingreso(50);
        assertEquals(150.0, c.getSaldo(), 1e-9);

        c.reintegro(30);
        assertEquals(120.0, c.getSaldo(), 1e-9);
    }
}
