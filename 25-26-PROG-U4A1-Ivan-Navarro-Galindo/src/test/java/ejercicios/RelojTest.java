package ejercicios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelojTest {
    @Test
    @DisplayName("Constructor por defecto: 00:00:00 y 12:00:00 am")
    void constructorPorDefecto() {
        Reloj r = new Reloj();
        assertEquals("00:00:00", r.hora24());
        assertEquals("12:00:00 am", r.hora12());
    }
    @Test
    @DisplayName("Constructor con 13:05:09 → 24h=13:05:09, 12h=01:05:09 pm")
    void constructorConParametros() {
        Reloj r = new Reloj(13, 5, 9);
        assertEquals("13:05:09", r.hora24());
        assertEquals("01:05:09 pm", r.hora12());
    }
    @Test
    @DisplayName("ponerEnHora(h,m) pone segundos a 0")
    void ponerEnHora_hm() {
        Reloj r = new Reloj();
        r.ponerEnHora(9, 7);
        assertEquals("09:07:00", r.hora24());
        assertEquals("09:07:00 am", r.hora12());
    }
    @Test
    @DisplayName("ponerEnHora(h,m,s) establece los tres componentes")
    void ponerEnHora_hms() {
        Reloj r = new Reloj();
        r.ponerEnHora(23, 59, 59);
        assertEquals("23:59:59", r.hora24());
        assertEquals("11:59:59 pm", r.hora12());
    }
    @Test
    @DisplayName("ponerEnHora12(h12,m,s, esPm): casos AM/PM")
    void ponerEnHora12_am_pm() {
        Reloj r = new Reloj();
        r.ponerEnHora12(12, 0, 0, false);
        assertEquals("00:00:00", r.hora24());
        assertEquals("12:00:00 am", r.hora12());
        r.ponerEnHora12(12, 0, 0, true);
        assertEquals("12:00:00", r.hora24());
        assertEquals("12:00:00 pm", r.hora12());
        r.ponerEnHora12(1, 23, 45, true);
        assertEquals("13:23:45", r.hora24());
        assertEquals("01:23:45 pm", r.hora12());
    }
}
