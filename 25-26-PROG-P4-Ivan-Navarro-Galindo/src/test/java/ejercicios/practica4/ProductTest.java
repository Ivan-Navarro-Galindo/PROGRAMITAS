package ejercicios.practica4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void constructorYGettersSettersBasicos() {
        Product p = new Product("P001", "Ratón gaming", 15.99);
        assertEquals("P001", p.getId());
        assertEquals("Ratón gaming", p.getName());
        assertEquals(15.99, p.getPrice(), 1e-9);

        p.setName("Ratón Pro");
        p.setPrice(17.49);
        assertEquals("Ratón Pro", p.getName());
        assertEquals(17.49, p.getPrice(), 1e-9);
    }
}
