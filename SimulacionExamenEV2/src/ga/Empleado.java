package ga;

public class Empleado {


    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    //Constructores
    public Empleado(){

    }

    public Empleado(String nombre, String apellidos, int edad, double salario){

        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setSalario(salario);
    }

    //Getters(return)
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public double getSalario(){
        return salario;
    }

    //Setters(no devuelve nada, no hay return)
    public void setNombre(String nuevoNombre) throws IllegalArgumentException {
        if (nuevoNombre == null || nuevoNombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser null o estar vacio");
        } else
            this.nombre = nuevoNombre;
    }

    public void setApellidos(String nuevoApellido) throws IllegalArgumentException{
        if (nuevoApellido == null || nuevoApellido.isEmpty()){
            throw new IllegalArgumentException("Los apellios no pueden ser null o estar vacios");
        } else
            this.apellidos = nuevoApellido;
    }

    public void setEdad(int nuevaEdad) throws IllegalArgumentException{
        if (nuevaEdad < 16) {
            throw new IllegalArgumentException("Edad invalida, debe ser mayo de 16");
        } else
            this.edad = nuevaEdad;
    }

    public void setSalario(double nuevoSalario) throws IllegalArgumentException{
        if (nuevoSalario == salario || nuevoSalario < 0) {
            throw new IllegalArgumentException("Salario no valido");
        } else
            this.salario += nuevoSalario;
    }

    //Otros
    public boolean plus(double sueldoPlus){
        if (edad > 40){
            this.salario += sueldoPlus;
            return true;
        } else
            return false;
    }

    public String toString(){
       return "Nombre: " +nombre+ " Apellidos: " +apellidos+ " Edad: " +edad;
    }
}
