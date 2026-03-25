package GYM;

public class Socio {

    //Atributos
    private Person person;
    private double cuotaMensual;


    //Contructor

    public Socio(String nombre, String apellidos, int edad, double peso){
        this.person = new Person(nombre, apellidos, edad, peso);
        this.cuotaMensual = 30.0;
    }
    public Socio(Person person, double cuotaMensual){
        setPerson(person);
        setCuotaMensual(cuotaMensual);
    }

    //GETTERS (return)

    public Person getPerson(){
        return person;
    }

    public double getCuotaMensual(){
        return cuotaMensual;
    }

    //Setters (void)
    public void setPerson(Person nuevaPerson) {
        this.person =nuevaPerson;
    }

    public void setCuotaMensual(double nuevaCuotaMensual){
        this.cuotaMensual = nuevaCuotaMensual;
    }

    //Otross
    public String toString(){
        return "GYM.Socio: " +person+ " cuota: " +cuotaMensual;
    }
}
