package ejercicios.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartLineTest {

    @Test
    void subtotalSeCalculaComoPrecioPorCantidad() {
        Product p = new Product("P002", "Teclado Pro", 45.0);
        CartLine line = new CartLine(p, 2);

        assertEquals(90.0, line.getSubtotal(), 1e-9);

        line.setQuantity(3);
        assertEquals(135.0, line.getSubtotal(), 1e-9);
    }

    @Test
    void gettersBasicos() {
        Product p = new Product("P003", "Alfombrilla XL", 9.5);
        CartLine line = new CartLine(p, 1);

        assertEquals("P003", line.getProduct().getId());
        assertEquals("Alfombrilla XL", line.getProduct().getName());
        assertEquals(9.5, line.getProduct().getPrice(), 1e-9);

        assertEquals(1, line.getQuantity());
    }
}