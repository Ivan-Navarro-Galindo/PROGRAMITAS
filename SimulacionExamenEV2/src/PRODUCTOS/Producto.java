package PRODUCTOS;

public class Producto {
    private String codigo;
    private String nombre;
    private String categoria;
    private int stock;
    private double precio;

    public Producto(String codigo, String nombre, String categoria, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Producto{codigo='" + codigo + "', nombre='" + nombre + "', categoria='" + categoria +
                "', stock=" + stock + ", precio=" + precio + "}";
    }
}