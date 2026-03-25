package Peliculas;

public class Pelicula {
    private String id;
    private String titulo;
    private String director;
    private String genero;
    private int anio;
    private int duracionMinutos;

    public Pelicula(String id, String titulo, String director, String genero, int anio, int duracionMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.anio = anio;
        this.duracionMinutos = duracionMinutos;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    @Override
    public String toString() {
        return "Pelicula{id='" + id + "', titulo='" + titulo + "', director='" + director +
                "', genero='" + genero + "', anio=" + anio + ", duracion=" + duracionMinutos + "min}";
    }
}