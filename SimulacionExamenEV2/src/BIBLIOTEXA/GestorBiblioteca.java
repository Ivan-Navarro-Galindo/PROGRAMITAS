package BIBLIOTEXA;

import ga.Gestor;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.Iterator;

public class GestorBiblioteca {
    //Atributos
    private ArrayList<Libro> libros;


    public GestorBiblioteca(){
        libros = new ArrayList<>();
    }

    public void addLibro (Libro libro){
        if(libros.contains(libro)) throw new IllegalArgumentException("Ya existe este libro");
        libros.add(libro);

    }

    public Libro getLibroByIsbn(String isbn){
        for (Libro l : libros){
            if(l.getIsbn().equals(isbn)){
                return l;
            }
        }
       return null;
    }

    public void deleteLibroByIsbn(String isbn){
        Iterator<Libro> it = libros.iterator();

        while(it.hasNext()){
            Libro l = it.next();
            if(l.getIsbn().equals(isbn)){
                it.remove();
                return;
            }
        }
    }

    public void deleteLibrosByAutor(String autor){
        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getAutor().equals(autor)){
                System.out.println("Eliminado correctamente");
                return;
            }
        }
    }

//    public Libro getLibrosFilteredByPrecio(double precioMax){
//        for (int i = 0; i < libros.size(); i++) {
//            if(libros.get(i).getPrecio() == precioMax){
//                return libros.get(i);
//            }
//        }
//        return null;
//    }

    public ArrayList<Libro> getLibrosFilteredByPrecio(double precioMax){
        ArrayList<Libro> result = new ArrayList<>();

        for (Libro l : libros){
            if (l.getPrecio() < precioMax){
                result.add(l);
            }
        }

        return result;
    }

    //public Libro getLibrosByAnio(int anioMin){

//        for (Libro l: libros){
//            if(l.getAnio() == anioMin){
//                return l;
//            }
//        }
//        return null;

   // }

    public ArrayList<Libro> getLibrosByAnio(int anioMin){
        ArrayList<Libro> result = new ArrayList<>();

        for (Libro l : libros){
            if(l.getAnio() >= anioMin){
                result.add(l);
            }
        }
        return result;
    }

    public void updateLibro(Libro nuevoLibro){

        for (int i = 0; i < libros.size(); i++) {
            if(libros.get(i).getIsbn().equals(nuevoLibro.getIsbn())){
                libros.set(i, nuevoLibro);
                return;
            }
        }
    }


}
