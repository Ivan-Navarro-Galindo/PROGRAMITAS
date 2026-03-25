package Alumnos;

import com.sun.source.tree.ArrayAccessTree;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorAlumnos {
    //Atributos

    private ArrayList<Alumno> alumnos;



    //Constructor

    public GestorAlumnos(){
        alumnos = new ArrayList<>();
    }


    public void addAlumno(Alumno alumno){
        if(alumnos.contains(alumno)){throw new IllegalArgumentException("Ya existe");}
        alumnos.add(alumno);
    }

    public Alumno getAlumnoByDni(String dni){

        for (Alumno al: alumnos){
            if(al.getDni().equals(dni)){
                return al;
            }
        }
        return null;
    }

    public void deleteAlumnoByDni(String dni){

        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()){
            Alumno al = it.next();
            if(al.getDni().equals(dni)){
                it.remove();
            }
        }
    }

    public int deleteAlumnoByNombre(String nombre){

        int cantidadElimindos = 0;

        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()){
            Alumno al = it.next();
            if(al.getNombre().equals(nombre)){
                it.remove();
                cantidadElimindos++;
            }
        }
        return cantidadElimindos;
    }

    public ArrayList<Alumno> getAprobados(){

        ArrayList<Alumno> aprobados = new ArrayList<>();

        for (Alumno al : alumnos){
            if(al.getNota() > 5){
                aprobados.add(al);
            }
        }
        return aprobados;
    }

    public ArrayList<Alumno> getSusoendido(){

        ArrayList<Alumno> suspendidos = new ArrayList<>();

        for (Alumno al: alumnos){
            if(al.getNota() < 5){
                suspendidos.add(al);
            }
        }
        return suspendidos;
    }

    public double getMediaNotasByEdad(int edad){
        double suma = 0;
        double cantidad = 0;

        for (Alumno al: alumnos){
            if (al.getEdad() == edad) {
                suma +=al.getNota();
                cantidad++;
            }
        }

        if(cantidad == 0) return 0;
        return suma / cantidad;
    }

    public void subirNotaMinima(double notaMinima){

        for (Alumno al : alumnos){
            if(al.getNota() < notaMinima){
                al.setNota(notaMinima);
            }
        }

    }





}
