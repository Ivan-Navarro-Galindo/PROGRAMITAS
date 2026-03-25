package ejercicios.practica4;

public class CartLine {
    //Atributos
    private Product product;
    //Clave foreanea
    private int quantity;

    //CONSTRUCTORES
    public CartLine(Product product, int quantity) {
       this.product = product;
       setQuantity(quantity);
    }
    //GETTERS
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getSubtotal() {
        //multiplicamos el precio del producto por su cantidad
        return product.getPrice() * quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

}
