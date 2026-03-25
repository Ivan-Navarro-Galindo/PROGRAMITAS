package Alumnos;
public class Alumno {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private double nota;

    public Alumno(String dni, String nombre, String apellidos, int edad, double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nota = nota;
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return "Alumno{dni='" + dni + "', nombre='" + nombre + "', apellidos='" + apellidos +
                "', edad=" + edad + ", nota=" + nota + "}";
    }
}