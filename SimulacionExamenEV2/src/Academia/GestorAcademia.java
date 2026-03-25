package Academia;

import GYM.GestorGym;

import java.util.ArrayList;

public class GestorAcademia {
    //Atributos
    private ArrayList<Alumno> alumnos;
    private ArrayList<Profesor> profesores;


    //Constructor

    public GestorAcademia(){
        alumnos = new ArrayList<>();
    }

    //metodos

    public void addAlumno(Alumno alumno) throws Exception{
        if (alumnos.contains(alumno)) throw new Exception("La lista contiene a ese alumno");
        alumnos.add(alumno);
    }
    public Alumno getAlumnosByIndex(int index){
        return alumnos.get(index);
    }

    public void removeAlumnosByIndex(int index){
        alumnos.remove(index);
    }

    public void setAlumnoByIndex(int index, Alumno nuevoAlumno){
        alumnos.set(index, nuevoAlumno);
    }

    public ArrayList<Alumno> getAllAlumnos(){
        return alumnos;
    }

    public void clear(){
        alumnos.clear();
    }

    public ArrayList<Alumno> getNotaMediaSuperior(double notaMedia){
        ArrayList<Alumno> resultado = new ArrayList<>();

        for (Alumno a: alumnos){
            if (a.getNotaMedia() > notaMedia){
                alumnos.add(a);
            }
        }
        return resultado;
    }
}
