package ga;

public class Comercial {

    //Atributos
    private Empleado empleado;
    private double comision;

    //Constructores
    public Comercial(String nombre, String apellidos, int edad, double salario, double comision){
        this.empleado = new Empleado(nombre, apellidos, edad, salario);
        this.comision = 0;
    }

    public Comercial(Empleado empleado, double comision){

        setEmpleado(empleado);
        setComision(comision);

    }

    //Getters(return)
    public Empleado getEmpleado(){
        return empleado;
    }

    public double getComision(){
        return comision;
    }

    //Setters(void, no devuelve nada)
    public void setEmpleado(Empleado nuevoEmpleado){
        this.empleado = nuevoEmpleado;
    }

    public void setComision(double nuevaComision){
        this.comision = nuevaComision;
    }


    //Otros
    public String toString(){
        return "ga.Comercial: " +empleado+ "Comision: " +comision;
    }
}
