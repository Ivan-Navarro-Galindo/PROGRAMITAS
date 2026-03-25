package HOTEL;

public class Huesped {

    //Atributos
    private Person person;
    private String numeroHabitacion;
    private double precioPorNoche;

    //Constructor
    public Huesped(String nombre, String apellidos, int edad, String email){
        this.person = new Person(nombre, apellidos, edad, email);
        this.precioPorNoche = 50.0;
        this.numeroHabitacion = null;
    }
    public Huesped(Person person, String numeroHabitacion, double precioPorNoche){
        setPerson(person);
        setNumeroHabitacion(numeroHabitacion);
        setPrecioPorNoche(precioPorNoche);
    }

    //getters (return)
    public Person getPerson(){
        return person;
    }

    public String getNumeroHabitacion(){
        return numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    //Setters (void)
    public void setPerson(Person nuevaPerson) {
        this.person = nuevaPerson;
    }

    public void setNumeroHabitacion(String nuevoNumero){
        this.numeroHabitacion = nuevoNumero;
    }

    public void setPrecioPorNoche(double nuevoPrecioPorNoche){
        this.precioPorNoche = nuevoPrecioPorNoche;
    }

    //Otros

    public String toString(){
        return "Academia.Persona: " +person+ " Numero de Habitacion: " +numeroHabitacion+ " Precio por Noche: " +precioPorNoche;
    }
}
