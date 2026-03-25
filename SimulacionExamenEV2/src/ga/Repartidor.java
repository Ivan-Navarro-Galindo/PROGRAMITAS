package ga;

public class Repartidor {

    //Atributos
    private Empleado empleado;
    private String zona;

    //Constructor

    public Repartidor(String nombre, String apellidos, int edad, double salario){
        this(new Empleado(nombre, apellidos, edad, salario), null);
    }

    public Repartidor(Empleado empleado, String zona){

        this.empleado = empleado;
        this.zona = zona;

    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public String getZona(){
        return zona;
    }

    public String toString(){
        return "Emplado: "+empleado.toString()+ " Zona: " +zona;
    }
}
