package Tienda;

public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;


    public Persona(){

    }

    public Persona(String nombre, String apellidos, int edad, String email) {

    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public String getEmail(){
        return email;
    }

    //Setters

    public void setNombre(String nuevoNombre) throws NullPointerException{
        if (nuevoNombre.isEmpty()){
            throw new NullPointerException("El nuevo nombre no puede estar vacio");
        } else
            this.nombre = nuevoNombre;
    }


    public void setApellidos(String nuevoApellido) throws NullPointerException{
        if(nuevoApellido.isEmpty()){
            throw new NullPointerException("El nuevo apellido no puede estar vacio");
        }else
            this.apellidos = nuevoApellido;
    }

    public void setEdad(int nuevaEdad) throws NullPointerException {
        if (nuevaEdad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        } else
            this.edad = nuevaEdad;
    }

    public void setEmail(String nuevoEmail) throws NullPointerException{
        if(nuevoEmail.isEmpty()){
            throw new NullPointerException("No puede estar vacio");
        }else
            this.email = nuevoEmail;
    }


    //Otros

    public boolean esVip(double totalCompras){
        if(totalCompras > 500){
            return true;
        }else
            return false;
    }

    public String toString() {
        return "Nombre: " +nombre+ "Apellido: " +apellidos+ "edad: "+email;
    }
}


