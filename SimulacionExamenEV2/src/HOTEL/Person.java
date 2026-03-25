package HOTEL;

public class Person {

    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    //Constructores
    public Person(){

    }
    public Person(String nombre,String apellidos, int edad, String email){

        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setEmail(email);

    }

    //Getters (return)
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

    //Setters (voids)
    public void setNombre(String nuevoNombre)  throws IllegalArgumentException {
        if (nuevoNombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacio");
        this.nombre = nuevoNombre;
    }

    public void setApellidos(String nuevoApellido) throws IllegalArgumentException {
        if (nuevoApellido.isEmpty()) throw new IllegalArgumentException("El apellido no puede estar vacio");
        this.apellidos = nuevoApellido;
    }
    public void setEdad(int nuevaEdad) throws IllegalArgumentException{
        if (edad < 0) throw new IllegalArgumentException("La edad no puede ser negativa");
        this.edad = nuevaEdad;
    }
    public void setEmail(String nuevoEmail) throws IllegalArgumentException{
        if (nuevoEmail.isEmpty()) throw new IllegalArgumentException("El email no puede estar vacio");
        this.email = nuevoEmail;
    }

    //Otro
    public boolean esMayorDeEdad(){
        if (edad >= 18){
            return true;
        }else return false;
    }

    public String toString(){
        return "Nombre: "+nombre+ " Apellidos " +apellidos+ " Edad: " +edad+ " Email: "+email;
    }
}
