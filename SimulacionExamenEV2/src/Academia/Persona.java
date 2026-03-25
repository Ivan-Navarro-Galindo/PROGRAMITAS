package Academia;

public class Persona {

    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String telefono;


    //Constructor
    public Persona(){
    }

    public Persona(String nombre, String apellidos, int edad, String telefono){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setTelefono(telefono);
    }

    //getters(return)
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public String getTelefono(){
        return telefono;
    }

    //setters(void)
    public void setNombre(String nuevoNombre) throws IllegalArgumentException{
        if (nuevoNombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacio");
        this.nombre = nuevoNombre;
    }

    public void setApellidos(String nuevoApellido) throws IllegalArgumentException{
        if (nuevoApellido.isEmpty()) throw new IllegalArgumentException("Los apellidos no pueden estar vacios");
        this.apellidos = nuevoApellido;
    }

    public void setEdad(int nuevaEdad) throws IllegalArgumentException{
        if (edad < 0) throw new IllegalArgumentException("No puede ser negativa");
        this.edad = nuevaEdad;
    }

    public void setTelefono(String nuevoTelefono) throws IllegalArgumentException{
        if (telefono.isEmpty()) throw new IllegalArgumentException("No puede estar vacio");
        this.telefono = nuevoTelefono;
    }

    //Otros
    public boolean esMenorDeEdad(){
        if (edad < 18) {
            return true;
        }else
            return false;
    }

    public String toString(){
        return "Nombre: " +nombre+ " Apellidos: "+apellidos;
    }

}
