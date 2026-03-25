package ejercicios.practica4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void agregarProductosNuevosActualizaLineasItemsYTotal() {
        Cart cart = new Cart(10);
        Product p1 = new Product("P001", "Ratón gaming", 15.99);
        Product p2 = new Product("P002", "Teclado Pro", 45.00);
        Product p3 = new Product("P003", "Alfombrilla XL", 9.50);

        cart.addProduct(p1, 2);   // 2 x 15.99
        cart.addProduct(p2, 1);   // 1 x 45.00
        cart.addProduct(p3, 3);   // 3 x 9.50

        assertEquals(3, cart.getNumProducts());
        assertEquals(6, cart.getTotalItems());
        assertEquals(2*15.99 + 45.00 + 3*9.50, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void anadirMismoProductoAcumulaCantidadSinDuplicarLinea() {
        Cart cart = new Cart(10);
        Product p1 = new Product("P001", "Ratón gaming", 15.99);

        cart.addProduct(p1, 1);
        // simula que llega el mismo producto (mismo id) desde otra parte del código
        Product p1b = new Product("P001", "Ratón gaming", 15.99);
        cart.addProduct(p1b, 2);

        assertEquals(1, cart.getNumProducts());
        assertEquals(3, cart.getTotalItems());
        assertEquals(3 * 15.99, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void modificarCantidadACeroEliminaLaLinea() {
        Cart cart = new Cart(10);
        Product p = new Product("P010", "Cable USB-C", 7.0);

        cart.addProduct(p, 5);
        assertEquals(1, cart.getNumProducts());
        assertEquals(5, cart.getTotalItems());

        cart.modifyQuantity("P010", 0); // debe eliminar la línea
        assertEquals(0, cart.getNumProducts());
        assertEquals(0, cart.getTotalItems());
        assertEquals(0.0, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void incrementarYDisminuirCantidadFuncionanYEliminanAlLlegarACero() {
        Cart cart = new Cart(10);
        Product p = new Product("P020", "Hub USB", 20.0);

        cart.addProduct(p, 1);
        assertEquals(1, cart.getTotalItems());

        cart.incrementQuantity("P020");
        assertEquals(2, cart.getTotalItems());
        assertEquals(40.0, cart.getTotalPrice(), 1e-9);

        cart.decrementQuantity("P020"); // 1
        assertEquals(1, cart.getTotalItems());

        cart.decrementQuantity("P020"); // 0 -> debe eliminar la línea
        assertEquals(0, cart.getNumProducts());
        assertEquals(0, cart.getTotalItems());
        assertEquals(0.0, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void removeProductEliminaLaLineaSinAfectarOtras() {
        Cart cart = new Cart(10);
        cart.addProduct(new Product("A", "A", 1.0), 1);
        cart.addProduct(new Product("B", "B", 2.0), 2);
        cart.addProduct(new Product("C", "C", 3.0), 3);

        cart.removeProduct("B");

        assertEquals(2, cart.getNumProducts());
        assertEquals(1 + 3, cart.getTotalItems());
        assertEquals(1.0*1 + 3.0*3, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void clearVaciaElCarrito() {
        Cart cart = new Cart(10);
        cart.addProduct(new Product("X", "X", 2.0), 2);
        cart.addProduct(new Product("Y", "Y", 5.0), 1);

        cart.clear();

        assertEquals(0, cart.getNumProducts());
        assertEquals(0, cart.getTotalItems());
        assertEquals(0.0, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void capacidadMaximaNoPermiteMasLineas() {
        Cart cart = new Cart(1); // capacidad 1
        cart.addProduct(new Product("P1", "Prod1", 10.0), 1);
        cart.addProduct(new Product("P2", "Prod2", 20.0), 1); // debería ignorarse por falta de hueco

        assertEquals(1, cart.getNumProducts());
        assertEquals(1, cart.getTotalItems());
        assertEquals(10.0, cart.getTotalPrice(), 1e-9);
    }

    @Test
    void printCartMuestraInformacionBasica() {
        Cart cart = new Cart(10);
        cart.addProduct(new Product("P1", "Prod1", 10.0), 2);
        cart.addProduct(new Product("P2", "Prod2", 5.5), 1);

        // Capturamos la salida estándar temporalmente
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(baos));
        try {
            cart.printCart();
        } finally {
            System.setOut(oldOut);
        }

        String out = baos.toString();
        assertTrue(out.contains("Prod1"));
        assertTrue(out.contains("Prod2"));
        assertTrue(out.contains("TOTAL"));
    }

    @Test
    void operacionesConIdInexistenteNoRompenElEstado() {
        Cart cart = new Cart(10);
        cart.addProduct(new Product("P1", "Prod1", 10.0), 1);

        cart.modifyQuantity("NOPE", 5); // no existe
        cart.incrementQuantity("NOPE"); // no existe
        cart.decrementQuantity("NOPE"); // no existe
        cart.removeProduct("NOPE");     // no existe

        assertEquals(1, cart.getNumProducts());
        assertEquals(1, cart.getTotalItems());
        assertEquals(10.0, cart.getTotalPrice(), 1e-9);
    }
}