package GYM;

public class Person {

    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private double peso;
    private double cuota;

    //Constructores

    public Person(){

    }

    public Person (String nombre, String apellidos, int edad, double peso){
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setPeso(peso);
        //setCuota(cuota);
    }


    //public GYM.HOTEL.Person(String nombre, String apellidos, int edad, double peso) {
   // }

    //GETTERS (return)
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public double getPeso(){
        return peso;
    }

    public double getCuota(){
        return cuota;
    }

    //Setters (void)
    public void setNombre(String nuevoNombre) throws IllegalArgumentException{
        if (nuevoNombre.isEmpty()){
            throw new IllegalArgumentException("El Nombre no puede estar vocio o contener NULL");
        } else
            this.nombre = nuevoNombre;
    }

    public void setApellidos(String nuevoApellido) throws IllegalArgumentException{
        if (nuevoApellido.isEmpty()){
            throw new IllegalArgumentException("El apellido no puede estar vacio o ser NULL");
        } else
            this.apellidos = nuevoApellido;
    }

    public void setEdad(int nuevaEdad) throws IllegalArgumentException{
        if (edad < 0){
            throw new IllegalArgumentException("No se admiten negativos");
        } else
            this.edad = nuevaEdad;
    }

    public void setPeso(double nuevoPeso) throws IllegalArgumentException{
        if (peso < 0){
            throw new IllegalArgumentException("El peso no puede ser negativo");
        } else
            this.peso = nuevoPeso;
    }

    public void setCuota(double nuevaCuota) throws IllegalArgumentException{
        if (cuota == nuevaCuota || cuota < 0){
            throw new IllegalArgumentException("Cuota no valida");
        }
    }

    //Otros

    public boolean descuento(double porcentaje){
        if (edad < 25){
            this.cuota += porcentaje;
            return true;
        } else return false;
    }

    public String toString(){
        return "Nombre: " +nombre+ " apellidos: "+apellidos+ " edad: " +edad+ " peso: " +peso;
    }
}
