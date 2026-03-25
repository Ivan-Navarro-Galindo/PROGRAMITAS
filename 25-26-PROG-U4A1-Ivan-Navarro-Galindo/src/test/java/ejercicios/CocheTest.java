package ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CocheTest {
    @Test
    @DisplayName("Constructor completo y getters")
    void constructorYGetters() {
        Coche c = new Coche("Fiesta","Rojo",true,"1234-ABC", Coche.Tipo.MINI,2018,Coche.Seguro.TODO_RIESGO);
        assertEquals("Fiesta", c.getModelo());
        assertEquals("Rojo", c.getColor());
        assertTrue(c.isMetalizada());
        assertEquals("1234-ABC", c.getMatricula());
        assertEquals(Coche.Tipo.MINI, c.getTipo());
        assertEquals(2018, c.getAnioFabricacion());
        assertEquals(Coche.Seguro.TODO_RIESGO, c.getSeguro());
    }
    @Test
    @DisplayName("imprimeCoche() devuelve modelo y color en el formato esperado")
    void imprimeCocheDevuelveModeloYColor() {
        Coche c = new Coche("Clio","Azul",false,"5678-DEF", Coche.Tipo.UTILITARIO,2020,Coche.Seguro.TERCEROS);
        String esperado = "Modelo: Clio, Color: Azul";
        assertEquals(esperado, c.imprimeCoche());
    }
}