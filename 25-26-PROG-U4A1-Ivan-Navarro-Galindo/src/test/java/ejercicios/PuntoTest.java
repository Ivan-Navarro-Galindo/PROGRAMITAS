package ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PuntoTest {
    @Test
    @DisplayName("Constructor sin parámetros crea el origen (0,0)")
    void origenConConstructorSinParametros() {
        Punto p = new Punto();
        assertEquals(0.0, p.getX());
        assertEquals(0.0, p.getY());
    }
    @Test
    @DisplayName("Punto medio entre (5,3) y (2,-1) es (3.5, 1.0)")
    void puntoMedio() {
        Punto p2 = new Punto(5, 3);
        Punto p3 = new Punto(2, -1);
        Punto medio = new Punto((p2.getX()+p3.getX())/2.0, (p2.getY()+p3.getY())/2.0);
        assertEquals(3.5, medio.getX(), 1e-9);
        assertEquals(1.0, medio.getY(), 1e-9);
    }
    @Test
    @DisplayName("Distancia al origen de (4,3) es 5.0")
    void distanciaAlOrigen() {
        Punto p = new Punto(4, 3);
        assertEquals(5.0, p.distancia(), 1e-9);
    }
    @Test
    @DisplayName("Distancia entre (5,3) y (2,-1) es 5.0")
    void distanciaAOtro() {
        Punto p2 = new Punto(5, 3);
        Punto p3 = new Punto(2, -1);
        assertEquals(5.0, p2.distancia(p3), 1e-9);
    }
}
