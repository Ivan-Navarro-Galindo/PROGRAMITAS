package BIBLIOTEXA;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anio;
    private double precio;

    public Libro(String titulo, String autor, String isbn, int anio, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anio = anio;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor +
                "', isbn='" + isbn + "', anio=" + anio + ", precio=" + precio + "}";
    }
}
