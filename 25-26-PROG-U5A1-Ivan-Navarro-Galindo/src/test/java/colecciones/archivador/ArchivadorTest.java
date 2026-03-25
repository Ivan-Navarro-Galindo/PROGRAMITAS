package colecciones.archivador;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ArchivadorTest {

    @Test
    void guardarYNumeroFichas() {
        Archivador a = new Archivador();
        assertEquals(0, a.numeroFichas());

        a.guardar(new Ficha("A", "Uno", 10));
        a.guardar(new Ficha("B", "Dos", 20));

        assertEquals(2, a.numeroFichas());
    }

    @Test
    void eliminarReduceElTamano() {
        Archivador a = new Archivador();
        Ficha f1 = new Ficha("A", "Uno", 10);
        Ficha f2 = new Ficha("B", "Dos", 20);

        a.guardar(f1);
        a.guardar(f2);
        assertEquals(2, a.numeroFichas());

        a.eliminar(f1);

        assertEquals(1, a.numeroFichas());
    }

    @Test
    void listarMuestraNombres() {
        Archivador a = new Archivador();
        a.guardar(new Ficha("A", "Uno", 10));
        a.guardar(new Ficha("B", "Dos", 20));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream old = System.out;
        System.setOut(new PrintStream(baos));

        a.listar();

        System.setOut(old);
        String out = baos.toString();

        assertTrue(out.contains("A"));
        assertTrue(out.contains("B"));
    }
}
