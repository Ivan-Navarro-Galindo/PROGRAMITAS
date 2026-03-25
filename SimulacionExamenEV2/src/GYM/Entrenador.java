package GYM;

public class Entrenador {

    //Atributos
    private Person person;
    private String especialidad;


    //Constructor (especialidad null)
    public Entrenador(String nombre, String apellidos, int edad, double peso){
        this.person = new Person(nombre,apellidos,edad,peso);
        this.especialidad = null;
    }

    public Entrenador(Person person, String especialidad){
        setPerson(person);
        setEspecialidad(especialidad);

    }

    //Getter (return)
    public Person getPerson(){
        return person;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    //Setters
    public void setPerson(Person nuevaPerson){
        this.person = nuevaPerson;
    }

    public void setEspecialidad(String nuevaEspecialidad){
        this.especialidad = nuevaEspecialidad;
    }

    //otro
    public String toString(){
        return " GYM.Entrenador: " +person+ " especialidad: " +especialidad;
    }
}
