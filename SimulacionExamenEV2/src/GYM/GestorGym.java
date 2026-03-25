package GYM;

import java.util.ArrayList;

public class GestorGym {
    //Atributos
    private ArrayList<Socio> socios;
    private ArrayList<Entrenador> entrenadores;


    //Constructor, inicializar la arraylist

    public GestorGym(){
        socios = new ArrayList<>();
        entrenadores = new ArrayList<>();
    }

    //Añadir socio
    public void addSocio(Socio socio) throws Exception{
        if (socios.contains(socio)) throw new Exception("El socio ya existe");
        socios.add(socio);
    }
    //Añadir entrenador
    public void addEntrenador(Entrenador entrenador) throws Exception{
        if (entrenadores.contains(entrenador)) throw new  Exception("El entrenador ya existe");
        entrenadores.add(entrenador);
    }
    //Obtener GYM.Socio por indice (getter)
    public Socio getSocio(int index) throws IndexOutOfBoundsException{
        return socios.get(index);
    }

    //Obtener GYM.Entrenador por indice (getter)
    public Entrenador getEntrenador(int index) throws IndexOutOfBoundsException{
        return entrenadores.get(index);
    }

    //Eliminar GYM.Socio
    public void removeSocio(int index) throws IndexOutOfBoundsException{
        socios.remove(index);
    }

    //Eliminar GYM.Entrenador
    public void removeEntrenador(int index) throws IndexOutOfBoundsException{
        entrenadores.remove(index);
    }

    //Modificar GYM.Socio (setter)
    public void setSocioByIndex(int index, Socio nuevoSocio) throws IndexOutOfBoundsException{
        socios.set(index, nuevoSocio);
    }

    //Modificar GYM.Entrenador (setter)
    public void setEntrenadorByIndex(int index, Entrenador nuevoEntrenador) throws IndexOutOfBoundsException{
        entrenadores.set(index, nuevoEntrenador);
    }

    //Obtener todos los socios
    public ArrayList<Socio> getAllSocios(){
        return socios;
    }

    //Obtener todos entrenadores
    public ArrayList<Entrenador> getAllEntrenadores(){
        return entrenadores;
    }

    //Obten
    public ArrayList<Socio> getSociosWithquote(double minCuota){
        ArrayList<Socio> resultado = new ArrayList<>();

        for (Socio s: socios){
            if (s.getCuotaMensual() > minCuota){
                resultado.add(s);
            }
        }
      return resultado;
    }

    public ArrayList<Entrenador> getEntrenadoresPorEspecialidad(String especialida){
        ArrayList<Entrenador> resultado = new ArrayList<>();

        for (Entrenador e : entrenadores){
            if (e.getEspecialidad().equals(especialida)){
                resultado.add(e);
            }
        }
        return resultado;
    }



}
