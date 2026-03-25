package HOTEL;

public class Empleado {
    //Atributos
    private Person person;
    private String departamento;
    private double salario;

    //Constructor
    public Empleado(String nombre, String apellidos, int edad, String email){
        this.person = new Person(nombre, apellidos, edad,email);
        this.salario = 1200.0;
        this.departamento = null;
    }

    public Empleado(Person person, String departamento, double salario){

    }

    //Getters (return)
    public Person getPerson(){
        return person;
    }

    public String getDepartamento(){
        return departamento;
    }

    public double getSalario(){
        return salario;
    }

    //Setters (void)
    public void setPerson(Person nuevaPerson){
        person = nuevaPerson;
    }

    public void setSalario(double nuevoSalario){
        salario = nuevoSalario;
    }

    public void setDepartamento(String nuevoDepartamento){
        departamento = nuevoDepartamento;
    }


    //Otros

    public String toString(){
        return "HOTEL.Empleado: " +person+ " Departamento: "+departamento+ " Salario: " +salario;
    }
}
