package Peliculas;

import Academia.Persona;
import PRODUCTOS.GestorProductos;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorPeliculas {
    //Atributos
    private ArrayList<Pelicula> peliculas;





    public GestorPeliculas(){
        peliculas = new ArrayList<>();
    }

    public void addPelicula(Pelicula pelicula){
        if(peliculas.contains(pelicula)){
            throw new IllegalArgumentException("Ya existe");
        }else
            peliculas.add(pelicula);
        }

    public Pelicula getPelicula(String id){
        for (Pelicula p: peliculas){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    public void deletePeliculaById(String id){

        for(Pelicula p: peliculas){
            if (p.getId().equals(id)){
                peliculas.remove(p);
            }
        }
    }


    public int deletePeliculasByDirector(String director){
        Iterator<Pelicula> it = peliculas.iterator();

        int contadorEliminadas = 0;
        while (it.hasNext()){
            Pelicula p = it.next();
            if(p.getDirector().equals(director)){
                it.remove();
                contadorEliminadas++;
            }
        }
        return contadorEliminadas;
    }

    public ArrayList<Pelicula> getPeliculasFilteredByDuracion(int duracionMax){
        ArrayList<Pelicula> flitradoDuracion = new ArrayList<>();

        for (Pelicula p : peliculas){
            if(p.getDuracionMinutos() < duracionMax){
                flitradoDuracion.add(p);
            }
        }
        return flitradoDuracion;
    }

    public ArrayList<Pelicula> getPeliculasByGenero(String genero){
        ArrayList<Pelicula> filtradoGenero = new ArrayList<>();

        for (int i = 0; i < peliculas.size(); i++) {
            if(peliculas.get(i).getGenero().equals(genero)){
                filtradoGenero.add(peliculas.get(i));
            }
        }
        return filtradoGenero;
    }

    public void updatePelicula(Pelicula nuevaPelicula){

        for (int i = 0; i < peliculas.size(); i++) {
            if(peliculas.get(i).getId().equals(nuevaPelicula.getId())){
                peliculas.set(i, nuevaPelicula);
                return;
            }
        }
    }

    public double getMediaAniosByGenero(String genero){
        double total = 0;
        double Total = 0;

        for (Pelicula p: peliculas){
           if(p.getGenero().equals(genero)){
               total++;
               Total += total / p.getAnio();
           }


        }

        return Total;
    }
}
