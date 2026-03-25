package ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AsignaturaTest {
    @Test
    @DisplayName("Constructor y getters con Matematicas, 1017, curso 1")
    void constructorYGetters() {
        Asignatura a = new Asignatura("Matemáticas", 1017, 1);
        assertEquals("Matemáticas", a.getNombre());
        assertEquals(1017, a.getCodigo());
        assertEquals(1, a.getCurso());
    }
}

