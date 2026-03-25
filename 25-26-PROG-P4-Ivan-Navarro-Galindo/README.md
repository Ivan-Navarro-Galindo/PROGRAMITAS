# Práctica 4: Carrito de Compra (E‑Commerce)

## Contexto
Implementa la base de un carrito de compra como primer paso de un proyecto e‑commerce. En esta fase se trabaja con POO básica: clases, encapsulación y arrays (Unidad 4). La solución debe ser clara, extensible y bien estructurada.

## Objetivos
- Modelar entidades con clases y composición.
- Gestionar colecciones mediante arrays.
- Implementar búsqueda, actualización y eliminación por ID.
- Calcular subtotales y totales.
- Organizar un módulo funcional dentro de un sistema mayor.

## Descripción breve
Implementa tres clases principales y una clase de prueba:
- `Product` — representa un artículo del catálogo (id único, name, price).
- `CartLine` — une un `Product` con una `quantity` y calcula su subtotal.
- `Cart` — gestiona un array de `CartLine` con capacidad fija y operaciones habituales (las modificaciones y eliminaciones se harán por product id).
- `PracticeCart` — clase con `main` para probar la implementación.

### Reglas funcionales clave
- `addProduct(Product p, int quantity)`
        - Si el producto (por id) ya existe, sumar la quantity.
        - Si no existe, crear una nueva línea (si hay capacidad).
        - Informar si el carrito está lleno.
- `modifyQuantity(String productId, int newQuantity)`
        - Si la nueva quantity es 0 → eliminar la línea.
- `incrementQuantity(String productId)` — aumentar en 1 la quantity de la línea.
- `decrementQuantity(String productId)` — disminuir en 1 la quantity; si llega a 0, eliminar la línea.
- `removeProduct(String productId)`
        - Suprimir la línea correspondiente (opcional: compactar el array).
- `clear()` — eliminar todas las líneas.
- `getTotalItems()` — suma de todas las quantities.
- `getNumProducts()` — número de líneas ocupadas (productos distintos).
- `getTotalPrice()` — suma de subtotales.
- `printCart()` — mostrar líneas y total en formato legible.


## Interfaces sugeridas

Product (sugerencia)
```java
public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price);
    public String getId();
    public String getName();
    public void setName(String name);
    public double getPrice();
    public void setPrice(double price);
}
```

CartLine (sugerencia)
```java
public class CartLine {
    private Product product;
    private int quantity;

    public CartLine(Product product, int quantity);
    public Product getProduct();
    public int getQuantity();
    public void setQuantity(int quantity);
    public double getSubtotal();
}
```

Cart (sugerencia)
```java
public class Cart {
    private CartLine[] lines;
    private int numLines;

    public Cart(int capacity);

    public void addProduct(Product p, int quantity);
    public void modifyQuantity(String productId, int newQuantity);
    public void incrementQuantity(String productId);
    public void decrementQuantity(String productId);
    public void removeProduct(String productId);
    public void clear();
    public int getTotalItems();
    public int getNumProducts();
    public double getTotalPrice();
    public void printCart();

    // Métodos auxiliares
    private int findProductById(String productId); // devuelve índice o -1
}
```

Clase de prueba (ejemplo)
```java
public class PracticeCart {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Ratón gaming", 15.99);
        Product p2 = new Product("P002", "Teclado Pro", 45.00);
        Product p3 = new Product("P003", "Alfombrilla XL", 9.50);

        Cart cart = new Cart(10);
        cart.addProduct(p1, 2);
        cart.addProduct(p2, 1);
        cart.addProduct(p3, 3);

        cart.modifyQuantity("P003", 1);
        cart.incrementQuantity("P002");
        cart.decrementQuantity("P003");
        cart.removeProduct("P001");

        cart.printCart();
        System.out.println("Total: " + cart.getTotalPrice());
    }
}
```

Formato de salida sugerido
```
Producto              Cantidad   Precio/u   Subtotal
----------------------------------------------------
Ratón gaming          2          15.99      31.98
Teclado Pro           1          45.00      45.00
----------------------------------------------------
TOTAL: 76.98 €
```


## Ampliaciones recomendadas (opcionales)
- Validar precios negativos y cantidades inválidas.
- Añadir método `findProductById` que devuelva índice o -1 (sugerido en Cart).
- Métodos para incrementar/decrementar cantidades (ya incluidos).
- Añadir más metadatos al `Product`.

---
Mantén el código modular, con responsabilidades claras y pruebas en `PracticeCart`.
