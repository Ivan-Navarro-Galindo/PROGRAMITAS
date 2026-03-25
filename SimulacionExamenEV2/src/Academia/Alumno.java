package Academia;

import HOTEL.Person;

public class Alumno {
    //Atributos
    private Persona persona;
    private String curso;
    private double notaMedia;



    //Constructor

    public Alumno(String nombre, String apellidos, int edad, String telefono){
        this.persona = new Persona(nombre,apellidos,edad,telefono);
        this.curso = null;
        this.notaMedia = 0.0;
    }
    public Alumno(Persona persona, String curso, double notaMedia){

    }


    //Getters
    public Persona getPersona(){
        return persona;
    }

    public String getCurso(){
        return curso;
    }

    public double getNotaMedia(){
        return notaMedia;
    }
    //Setters


    public void setPersona(Persona nuevaPersona){
        this.persona = nuevaPersona;
    }
    public void setCurso(String nuevoCurso){
        this.curso = nuevoCurso;
    }

    public void setNotaMedia(double nuevaNotaMedia) throws IllegalArgumentException{
        if (nuevaNotaMedia < 0 || nuevaNotaMedia > 10) throw new IllegalArgumentException("Debe estar en el rango de 0 a 10");
        this.notaMedia = nuevaNotaMedia;
    }

    public String toString(){
        return "Nombre: " +persona;
    }

    }
